package day20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
/*Sychronization- Process of matching Sel Speed with app
 * 1. Thread.sleep(n)-- Blind wait
 * 2. ImplicitWait - findElement & findElements			- 0S default time out
 *     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 * 
 * diff b/w IW & EW
 * handle sync of FE & FES				any method
 * NSEEE or empty list					TimeOutException
 * we declare once						multiple times
 * 
 * TimeUnit - D H M S m m n				only S
 * 3. WebDriverWait
 * 4. FluentWait 	(pollingEvery)
 * 5. pageLoadTimeout					--> 5M		default time out
 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
 * 
 * 6. scriptTimeout						--> 30S		default time out
 * driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
 * 7. custom wait- our own logic
 */

public class Demo1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.actitime.com/");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		FluentWait<WebDriver> f=new FluentWait<WebDriver>(driver);
		f.withTimeout(Duration.ofSeconds(10));
		f.until(ExpectedConditions.titleContains("Enter"));
		f.pollingEvery(Duration.ofSeconds(1));

		String title=driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

}
