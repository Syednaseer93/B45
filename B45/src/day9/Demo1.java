package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*tagName, id, name,className,linkText,partialLinkText, cssSelector & xpath
 * <span class="errormsg">Username or Password is invalid. Please try again.</span>

css
Cascading Style Sheets--- cssSelector--  

color=red

syntax-- tag[an='av']
<a id="a1" name="n1" class="c1" href="http://aksharatraining.com" title="Click Here">BhanuprakashaHK</a>

a[id='a1']			a[id="a1"]--- css expressions
a[name='n1']
a[class='c1']
a[href='http://aksharatraining.com']
a[title='Click Here']

limitation of css Selector
CSS selector supports only tag & attribute , but not the text
we cant identify the element using text in cssSelector

it will not support 'backward traversing' 
 * 
 */

public class Demo1 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void goback(WebDriver driver) throws InterruptedException {
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/B45/Demo1.html");
		driver.findElement(By.cssSelector("a[id='a1']")).click();
		goback(driver);
		driver.findElement(By.cssSelector("a[id=\"a1\"]")).click();
		goback(driver);
		driver.findElement(By.cssSelector("a[name='n1']")).click();
		goback(driver);
		driver.findElement(By.cssSelector("a[class='c1']")).click();
		goback(driver);
		driver.findElement(By.cssSelector("a[href='http://aksharatraining.com']")).click();
		goback(driver);
		driver.findElement(By.cssSelector("a[title='Click Here']")).click();
		goback(driver);
		driver.quit();
	}

}

