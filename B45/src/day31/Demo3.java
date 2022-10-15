package day31;

import org.testng.Reporter;
import org.testng.annotations.Test;

/*Can we run same test method multiple times?
 * Yes- using invocationCount
 * 
 * default value = 1 
 * 
 * in selenium we dont use invocationCount - duplicate data
 * 
 * we run test multiple times with diff data - Data Driven Testing - Data Provider
 * 
 */

public class Demo3 {
	
	final int i=3;
	@Test(priority = 0,  invocationCount = i)
	public void createUser() {
		Reporter.log("Create UserA",true);
	}

}
