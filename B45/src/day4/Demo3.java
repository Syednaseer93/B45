package day4;

public class Demo3 {
	public static void main(String[] args) {
//		Demo2 d2=new Demo2();
//		Demo1 d1;
//		d1=d2;//convert from child type to parent type-auto upcasting - automatic
//		d1.m1();//calling m1 method using Demo1 ref variable
		
		Demo1 d1=new Demo2(); //Auto up-casting
		d1.m1();//m2 of Demo1
	}
}
