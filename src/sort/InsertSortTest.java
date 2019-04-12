package sort;

public class InsertSortTest {
	
	public static void printArray(int[] array) {  
        System.out.print("{");  
        for (int i = 0; i < array.length; i++) {  
            System.out.print(array[i]);  
            if (i < array.length - 1) {  
                System.out.print(", ");  
            }  
        }  
        System.out.println("}");  
    }
	
	
	/*public static void insertSort(int[] array) {  
        if (array == null || array.length < 2) {  
            return;  
        }  
  
        for (int i = 1; i < array.length; i++) {  
            int currentValue = array[i];  
            int position = i;  
            for (int j = i - 1; j >= 0; j--) {  
                if (array[j] > currentValue) {  
                    array[j + 1] = array[j];  
                    position -= 1;  
                } else {  
                    break;  
                }  
            }  
  
            array[position] = currentValue;  
        }  
    }  */
	
	
	public static void insertSort(int[] numbers){
	    int size = numbers.length;
	    int temp = 0;
	    int j =  0;
	    
	    for(int i = 0 ; i < size ; i++){
	        temp = numbers[i];
	        //假如temp比前面的值小，则将前面的值后移
	        for(j = i ; j > 0 && temp < numbers[j-1] ; j --){
	        	numbers[j] = numbers[j-1];
	        }
	        numbers[j] = temp;
	    }
    }
	
	public static void selectSort(int[] numbers){
    int size = numbers.length; //数组长度
    int temp = 0 ; //中间变量
    
	    for(int i = 0 ; i < size ; i++){
	        int k = i;   //待确定的位置
	        //选择出应该在第i个位置的数
	        for(int j = size -1 ; j > i ; j--){
		        if(numbers[j] < numbers[k]){
		            k = j;
		        }
	        }
	        //交换两个数
	        temp = numbers[i];
	        numbers[i] = numbers[k];
	        numbers[k] = temp;
	    }
    }
  
    public static void main(String[] args) {  
        int[] array = { 3, -1, 0, -8, 2, 1 };  
        printArray(array);  
//        insertSort(array); 
//        selectSort(array);
//        bubbleSort(array);
        publicShellSort(array);
        printArray(array);  
    }


    private static void publicShellSort(int[] a) {
    	double d1=a.length;  
        int temp=0;  
        while(true){  
           d1= Math.ceil(d1/2);  
           int d=(int) d1;  
           for(int x=0;x<d;x++){  
               for(int i=x+d;i<a.length;i+=d){  
                  int j=i-d;  
                  temp=a[i];  
                  for(;j>=0&&temp<a[j];j-=d){  
                	  a[j+d]=a[j];  
                  }  
                  a[j+d]=temp;  
               }  
           }  
           if(d==1)  
               break;  
        }
	}

	public static void bubbleSort(int[] a) {
    	int temp=0;  
        for(int i=0;i<a.length;i++){  
           for(int j=i+1;j<a.length;j++){  
	           if(a[i]>a[j]){  
	               temp=a[i];  
	               a[i]=a[j];  
	               a[j]=temp;  
	           }  
           } 
        }
	}
}
