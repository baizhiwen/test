import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class TestNum {

	public static void main(String[] args) {
//		test1();
//		String s = "";
//		System.out.println(Double.valueOf(s));
//		System.out.println(6/2*(2+1));
//		test2();
//		test3();
//		test4();
		
//		test5();
//		test6();
		test7();
	}

	private static void test7() {
		
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		int sum = a + b;
		System.out.println(sum);
		
		BigInteger big = new BigInteger("100");
	}

	private static void test6() {
		System.out.println(Integer.valueOf("-1f",16));
	}

	private static void test5() {
		System.out.println(-10000/100);
		
	}

	private static void test4() {
		float sum = 0;
		for(int i = 0;i<100;i++){
			sum+=0.1;
		}
		System.out.println(sum);
	}

	private static void test3() {
		List<Integer> numList = new ArrayList<Integer>();
		for(int i = 0;i<100;i++){
			numList.add(i);
		}
		
		System.out.println("=============="+numList);
		int count = numList.size();
		for(int i = count-1;i>=0;i--){
			if(i%2==0){
				System.out.println(numList.get(i)+"==============");
				numList.remove(i);
			}else{
				System.out.println("++++++++"+numList.get(i));
			}
		}
		
	}

	private static void test2() {
		List<Integer> numList = new ArrayList<Integer>();
		for(int i = 0;i<100;i++){
			numList.add(i);
		}
		System.out.println("=============="+numList);
		for(Integer a :numList){
			Integer sum = 0;
			for(Integer num :numList){
				if(num==10){
					return;
				}else{
					sum+=num;
				}
			}
			System.out.println(a+"========="+sum);
		}
		
	}

	private static void test1() {
		float a = 3;
		float b = 10;
		float c = a/b;
		System.out.println(c);
	}

}
