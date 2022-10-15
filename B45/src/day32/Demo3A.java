package day32;

public class Demo3A {

	public static void test1()
	{
		System.out.println("test1 without arg");
	}
	
	public static void test1(String s1)
	{
		System.out.println("test1 with "+s1);
	}
	
	public static void test1(String s1,String s2)
	{
		System.out.println("test1 with "+s1+" "+s2);
	}
	
	
	
	public static void main(String[] args) {
		
		Demo3A.test1();
		Demo3A.test1("Bhanu");
		Demo3A.test1("Ravi","Surya");
		
		
		
	}

}
