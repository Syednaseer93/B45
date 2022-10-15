package day4;

public class Demo6 {

	public static void test(X x1) {
		x1.m1();
	}
	
	public static void main(String[] args) {
		X x1=new Y();
		Demo6.test(x1);//m1 of Y
		Demo6.test(new Z());//m1 of Z
	}

		//we can create ref var of interface
		//we can create object of child class of an interface and up caste it to
		// interface ref variable
		//we can call method present in the interface but it always executes
		// method present in child class- due to run time polymorphism
	
	//tomorrow- using this in selenium 
//	(every thing readily available - we just call them)
	
}
