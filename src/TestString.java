import java.util.HashSet;
import java.util.Set;

public class TestString {

	public static void main(String[] args) {
//		test1();
//		test2();
//		test3();
//		test4();
//		test5();
		test6();
		
	}

	private static void test6() {
		String s1 = "LeaveBillEntity";
		String s2 = s1.substring(0, s1.length()-6);
		System.out.println(s2);
	}

	private static void test5() {
		String s1 = "11111111111111111";
		String s2 = "22222222222";
		String s3 = "3333333333";
		String s4 = "444444444444";
			
		
	}

	private static void test4() {
		String testString = "user_123456";
		String[] tests = testString.split("_");
		System.out.println(tests[0]+"----------"+tests[1]);
	}

	private static void test3() {
		String testString = "123456";
		System.out.println(testString.substring(0, 1));
	}

	private static void test2() {
		System.err.println("--String.valueOf(\"\")--"+String.valueOf("")+"----");
		System.err.println("--String.valueOf(\" \")--"+String.valueOf(" ")+"----");
//		System.out.println("----"+String.valueOf(null)+"----");
		System.err.println("--\"\".toString()--"+"".toString()+"----");
		System.err.println("--\" \".toString()--"+" ".toString()+"----");
//		System.out.println("----"+null.toString()+"----");
		System.err.println("aaaaa");
	}

	private static void test1() {
		String a = "adfasdf";
		String b = a +"00001";
		System.out.println(b);
		Set<String> set = new HashSet<String>();
		set.add("1");
		set.add("1");
		set.add("2");
		set.add("3");
		for(String s:set){
			System.out.println(s);
		}
		System.out.println(set.size());
	}

}
