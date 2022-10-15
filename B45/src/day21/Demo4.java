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
 * Selenium 2 Question
 * what is the use of perform() and build().perform()
 * to execute any method of actions class we should call perform() 
 * to execute composite actions we should call  build().perform()
 * 
 * But in selenium 3 , perform()  internally calls  build().perform()
 * So no need to use build() from selenium 3...
 * https://github.com/SeleniumHQ/selenium/blob/trunk/java/src/org/openqa/selenium/interactions/Actions.java
 * 
 * public void perform() {
    build().perform();
  }
 * 
 * Uses of Actions class
 * 1. Mouse Hover - movetoElement
 * 2. Right click - contextClick
 * 3. double click
 * 4. Drap and drop
 * 5. composite actions
 */
public class Demo4 {

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
		//composite action- build().perform()
//		actions.clickAndHold(block1).pause(Duration.ofSeconds(1)).moveToElement(block3).pause(Duration.ofSeconds(3)).release().build().perform();
		actions.clickAndHold(block1).pause(Duration.ofSeconds(1)).moveToElement(block3).pause(Duration.ofSeconds(3)).release().perform();

	}

}
