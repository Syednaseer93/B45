package day34;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
/*How do u re-run only failed test- using testng-failed.xml
 * 
 * 
 */
public class Demo4 {

	@Test
	public void testA() {
		Reporter.log("testA",true);
	}
	
	@Test
	public void testB() {
		Reporter.log("testB",true);
		Assert.fail();
	}
	
	@Test
	public void testC() {
		Reporter.log("testC",true);
	}
	
	@Test
	public void testD() {
		Reporter.log("testD",true);
		Assert.fail();
	}
	
}
