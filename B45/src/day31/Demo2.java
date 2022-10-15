package day31;

import org.testng.Reporter;
import org.testng.annotations.Test;
/*
 * Can we have multiple test methods in  a same class?
 * Yes
 * What is the order of execution?
 * Alpha
 * can we change it?
 * yes- using priority - small to large
 * 
 * default priority value is 0
 * 
 * 2 methods have same priority then those 2 methods will be executed in alph order
 * 
 * in place of value we cant use variable but we can use constant
 * 
 * value should be int 
 * 
 */
public class Demo2 {
	
	final int i=1;
	@Test(priority = i)
	public void deleteUser() {
		Reporter.log("Delete User",true);
	}

	@Test
	public void editUser() {
		Reporter.log("Edit User",true);
	}
	
	@Test(priority = 1)
	public void updateUser() {
		Reporter.log("Update User",true);
	}
	
	@Test(priority = -1)
	public void registerUser() {
		Reporter.log("Register User",true);
	}
	


}
