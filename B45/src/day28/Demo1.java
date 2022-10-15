package day28;

/*Encapsulation: 
 * Process of binding data member(var) with member function (method) so that they behave as single unit
 * 
 * if a class has both getter and setter then is it not same as making that var as public?
 * No
 */


class A
{
	private int i;//declaration
	
	A(int i)
	{
		this.i=i;		//initialization
	}
	
	
	//utilization
	int getValue(String un) {			
		if(un.equals("bhanu")) 
		{
			return i;
		}
		else
		{
			return 0;
		}
	}
	
	void setValue(int i,String un) {
		
		if(un.equals("bhanu")) 
		{
			this.i=i;
		}
		else
		{
			System.out.println("Ur not authorized");
		}
	}
}

class B
{
	public int i;	
	
}
public class Demo1 {

	public static void main(String[] args) {
		
		A a1=new A(10);
		System.out.println(a1.getValue("bhanu"));
		System.out.println(a1.getValue("ravi"));
		
		A a2=new A(20);
		a2.setValue(22,"ravi");
		System.out.println(a2.getValue("bhanu"));
		
	}


}
