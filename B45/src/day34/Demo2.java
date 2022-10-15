package day34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/* Message will be printed only if Assertion fails 
 * We dont get any msg if Assertion is Pass
 * If Assert is failed then it will not execute remaining statement of current Test Method
 * ( other methods will be executed)
 * 
 */
public class Demo2 {
	
	WebDriver driver;
	
	//1
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	//2
	@BeforeMethod
	public void openBrowser() {
		driver=new ChromeDriver();
	}
	
	//3
	@Test
	public void testA() {
		
		driver.get("http://www.fb.com");
		
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Facebook – log in or signin");//1. compare (AV-EV) 2.report(Pass/Fail)
		
		Reporter.log("Bhanu:"+driver.getTitle(),true);
	}
	
	//4
		@AfterMethod
		public void closeBrowser() {
			driver.quit();
		}
}



