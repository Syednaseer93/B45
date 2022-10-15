package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
/*Meaning of StaleElementReferenceException
 * -> address of the element is old /invalid
 * 
 * When do we get StaleElementReferenceException?
 * 
 * After finding the element and 
 * before performing the action 
 * if page is refreshed then we get
 * 
 * StaleElementReferenceException
 * 
 */
public class Demo1 {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();	
		driver.get("https://demo.actitime.com/login.do");

		
		
		WebElement unTB = driver.findElement(By.id("username"));//i
		
		driver.navigate().refresh();
		
		
		unTB.sendKeys("admin");//u
		
	}
}











