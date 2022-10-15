package day31;

import org.testng.Reporter;
import org.testng.annotations.Test;
/*Test NG class - Test Class - Executable class
 *No main method - Test Method - any method with @Test 
 * After Executing TestNG class we get html report
 * ./test-output/emailable-report.html (run the code & refresh java project)
 * 
 * for reporting we dont use SOP , we use Reporter.log(msg,flag);
 * 
 * 
 */
public class Demo1 {

	
	@Test
	public void testA() {
		
		System.out.println("This is testA 1");//print only in console
		
		Reporter.log("This is testA 2");//print only in html report
		Reporter.log("This is testA 2a",false);//print only in html report
		
		Reporter.log("This is testA 3",true);//print in both console & html report 
	}
	
}
