import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class TestThread extends ThreadPoolExecutor {    
    
    public TestThread(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,    
            BlockingQueue<Runnable> workQueue, RejectedExecutionHandler handler) {    
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, handler);   
    }    
    
    private final ThreadLocal<Long> startTime = new ThreadLocal<Long>();    
    private final AtomicLong numTasks = new AtomicLong();    
    private final AtomicLong totalTime = new AtomicLong();    
    
    protected void beforeExecute(Thread t, Runnable r) {    
        super.beforeExecute(t, r);    
        System.out.println(String.format("Thread %s: start %s", t, r));    
        startTime.set(System.nanoTime());    
    }    
    
    protected void afterExecute(Runnable r, Throwable t) {    
        try {    
            long endTime = System.nanoTime();    
            long taskTime = endTime - startTime.get();    
            numTasks.incrementAndGet();    
            totalTime.addAndGet(taskTime);    
            System.out.println(String.format("Thread %s: end %s, time=%dns", t, r, taskTime));    
        } finally {    
            super.afterExecute(r, t);    
        }    
    }    
    
    protected void terminated() {    
        try {    
            System.out.println(String.format("Terminated: avg time=%dns", totalTime.get() / numTasks.get()));    
        } finally {    
            super.terminated();    
        }    
    }    
    
    private static class Task implements Runnable{    
    
        private String task;    
        public Task(String task){    
            this.task=task;    
        }    
            
        @Override    
        public void run() {    
            try {  
                System.out.println(task);    
                Thread.sleep(2000);  
                if(task.equals("51")){    
                    throw new RuntimeException();    
                }   
            } catch (InterruptedException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }   
        }    
            
    }    
    public static void main(String[] args) throws Exception {    
        TestThread pool =  new TestThread(3, 4, 4, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(3),    
                new ThreadPoolExecutor.CallerRunsPolicy());    
          
        for (int i = 0; i < 5; i++) {    
            try {    
                // 产生一个任务，并将其加入到线程池    
                String task = "" + i;    
                System.out.println("put " + task);    
                pool.execute(new Task(task));    
    
                // 便于观察，等待一段时间    
                Thread.sleep(500);    
            } catch (Exception e) {    
                e.printStackTrace();    
            }    
        }    
        Thread.sleep(5000);    
        pool.shutdown();    
        System.out.println(pool.getTaskCount()+"   c:"+pool.getCompletedTaskCount());    
    }    
}
