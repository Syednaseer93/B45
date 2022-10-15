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
import org.openqa.selenium.support.ui.WebDriverWait;
/*
 * Actions class can be used to doubleClick on the element
 * 
 */
public class Demo1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");
		
		System.out.println("Before");
		String msg = driver.findElement(By.id("box")).getText();
		System.out.println(msg);
		
		WebElement button = driver.findElement(By.cssSelector("input[type='button']"));
		
		Actions actions=new Actions(driver);
		actions.doubleClick(button).perform();
		
		System.out.println("After");
		msg = driver.findElement(By.id("box")).getText();
		System.out.println(msg);
		
	}

}
