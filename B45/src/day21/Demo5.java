package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo5 {
/*How do handle list box? using Select class
 *Select class has single arg constructor of type WebElement 
 * 
 * What are the methods to select the option?
 * selectByIndex
 * selectByValue
 * selectByVisibleText
 * 
 * Note: if argument of above method is invalid then we get NSEE
 * Note: Select class works only if listbox is developed using <select>
 * else we get UnexpectedTagNameException
 */
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("file:///F:/B45/Demo6.html");
		WebElement listBox = driver.findElement(By.id("A1"));

	
		Select select=new Select(listBox);
		Thread.sleep(500);
		select.selectByIndex(1);
		Thread.sleep(500);
		select.selectByValue("c");
		Thread.sleep(500);
		select.selectByVisibleText("Delhi");
	}

}
