package day34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
/* Message will be printed only if Assertion fails 
 * We dont get any msg if Assertion is Pass
 * If Assert is failed then it will not execute remaining statement of current Test Method
 * ( other methods will be executed)
 * 
 * To continue executing remaining statement even after failure we use soft assert
 * all the methods in soft assert are non-static
 * 
 * when we use SoftAssert , we must call assertAll() at the end (last statement of test method)
 * 
 * 		Assert 					& 			SoftAssert
 * 1.all methods are static 		1. all methods are non-static
 * 2.if condition fails , it will	2. if condition fails it will execute R C CTM
 * not execute remaining code of 
 * CTM 
 * 3. we do not call assertAll()	3. we must call assertAll() at the end
 * 4.suitable for verifying basic	4. minor features
 * & critical features	
 * 
 */
public class Demo3 {
	
	WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@BeforeMethod
	public void openBrowser() {
		driver=new ChromeDriver();
	}
	
	@Test
	public void testA() {
		
		driver.get("http://www.google.com");
		
		String title=driver.getTitle();
		
		SoftAssert softAssert=new SoftAssert();
		
		softAssert.assertEquals(title, "Poogle");//1. compare (AV-EV)
		
		Reporter.log("Bhanu:"+driver.getTitle(),true);
		
		softAssert.assertAll();//Report(Pass/Fail)
	}
	
	@AfterMethod
	public void closeBrowser() {
			driver.quit();
	}
}



