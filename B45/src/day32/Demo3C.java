package day32;

//what is the signature of main method, 

//can we change it?

//private method - not inherited - we cant override   
//final method - it is inherited but we cant override

//abstract method - overriding is mandatory 
//final method --  overriding not possible


public class Demo3C {

//	public static void main(String[] args)
//	{
//		System.out.println("HI");
//	}
	
//	static public void main(String[] args)
//	{
//		System.out.println("HI");
//	}
	
//	public static void main(String []args)
//	{
//		System.out.println("HI");
//
//	}
	
//	public static void main(String... bhanu)
//	{
//		System.out.println("HI");
//
//	}
	
	public static final void main(String args[])
	{
		System.out.println("HI");
	}
	
	
	
}
