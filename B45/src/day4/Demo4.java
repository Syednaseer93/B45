package day4;

public class Demo4 {

	public static void test(A a1) {
		a1.m1();
	}
	
	public static void main(String[] args) {
		
		Demo4.test(new A());
		Demo4.test(new B());
		Demo4.test(new C());
	}

}
