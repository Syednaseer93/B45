package day19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*How do you verify whether login page is loaded are not with in 3Seconds
 *
 * what is the max time the get method waits --> 5minutes
 * if the login page is not loaded after 5min also what happens?
 * we get TimeOutException
 * 
 * can we change the default timeout of get method? 
 * yes
 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
 * 
 * 
 */

public class Demo4 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		int t=30;
		
		WebDriver driver=new ChromeDriver();
		
		Duration dgetTO = driver.manage().timeouts().getPageLoadTimeout();
		System.out.println(dgetTO);
		
		
		//verify that login page is displayed or not with in  t sec
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(t));
		try 
		{
			driver.get("https://demo.actitime.com/login.do");
			System.out.println("Login Page is loaded within "+t+"Seconds");
		}
		catch (Exception e) {
			System.out.println("Login Page is NOT loaded within "+t+"Seconds");
		}
		
		//verify that home page is displayed or not with in tsec
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(t));
		
		try
		{
			wait.until(ExpectedConditions.titleContains("Enter"));
			System.out.println("Home Page is loaded within "+t+"Seconds");
		}
		catch (Exception e)
		{
			System.out.println("Home Page is Not loaded within "+t+"Seconds");
		}
		driver.quit();
	}

}







