package day34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
/*What is the default status of TestNG Test-> PASSED
 * 
 * How to change the Status of the TestNG Test to Failed?->Assert.fail();
 * 
 * All the methods in Assert class are static and overloaded 
 * 
 */
public class Demo1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void testA() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		String title=driver.getTitle();
//		if(title.equals("Google"))
//		{
//			Reporter.log("Pass: Google page is displayed",true);
//		}
//		else
//		{
//			Reporter.log("Fail: Google page is not displayed",true);
//			Assert.fail("Google page is not displayed");
//		}
		
		Assert.assertEquals(title, "Google");
//		Assert.assertNotEquals(null, null)
//		Assert.assertTrue(boolean)--True -Pass   False --Fail
//		Assert.assertFalse(boolean)--True -Fail   False - Pass
		
	}
}
