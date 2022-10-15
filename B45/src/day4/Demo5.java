package day4;

public class Demo5 {

	public static void main(String[] args) {
		X x1;// we can create ref variable of an interface
		Y y1;// we can create ref variable of a class 
		Z z1;
		
//		new X();//we cant create object of an inerface
		new Y();// we can create object of a class
		new Z();
		
		Y y2=new Y();
		y2.m1();			//m1 of Y
		
		Z z2=new Z();
		z2.m1();			//m1 of Z
		
		X x2=new Y();//auto upcasting 
		x2.m1();// m1 of Y
		
		X x3=new Z();//auto upcasting 
		x3.m1();// m1 of Z

	}

}
