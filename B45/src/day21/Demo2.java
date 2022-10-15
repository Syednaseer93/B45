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
 * Actions class can be used to perform drag and drop
 * How many methods we have to perform drag and drop
 * 2
 * dragAndDrop-- drag an element and drop it on to another element
 * dragAndDropBy- drag an element and drop it on to specific location (ex Flow chart)
 * 
 * Selenium limitation:
 * We cant drag a file from desktop/system folder and drop it on to a page
 * 
 * solution: use 3rd party automation tool
 * UFT
 * AutoIT
 * Winium 
 *  
 */
public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		
		WebElement block1 = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement block3 = driver.findElement(By.xpath("//h1[.='Block 3']"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(block1, block3).perform();
//		actions.dragAndDropBy(block3, x, y).perform();
		
	}

}
