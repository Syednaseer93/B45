package day32;

public class Demo3B {

	public static void test1(String... s) //variable arguments - var args ,elipse
	{
		//String[] s={"A","B"};
		System.out.println("-------");
		System.out.println(s.length);//array size
		
		for(String v:s)
		{
			System.out.println(v);
		}
		System.out.println("-------");
	}
	
	public static void testB(String[] s) //variable arguments - var args ,elipse
	{
		//String[] s={"A","B"};
		System.out.println("-------");
		System.out.println(s.length);//array size
		
		for(String v:s)
		{
			System.out.println(v);
		}
		System.out.println("-------");
	}
	
	//var arg must be last argument
	
	public static void test2(String s1,String... s2)//s1 mandatory s2 is optional 
	{
		//String[] s={"A","B"};
		System.out.println(s1);
		
		System.out.println("-------");
		System.out.println(s2.length);//array size
		
		
		for(String v:s2)
		{
			System.out.println(v);
		}
		System.out.println("-------");
	}
	
	
	public static void main(String[] args) {
		
		Demo3B.test1();
		Demo3B.test1("Bhanu");
		Demo3B.test1("Ravi","Surya","Chandra","Bhumi","Mangala");
		
		
		Demo3B.test2("Bhanu");
		Demo3B.test2("Ravi","Surya","Chandra","Bhumi","Mangala");
		
		String[] a= {"abc"};
		
		Demo3B.testB(a);
	}

}
