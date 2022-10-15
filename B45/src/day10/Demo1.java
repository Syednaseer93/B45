package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Path of the element in html tree is called as xpath
 * ex: ./html/body/a
 * dot means current webpage --> root element 
 * 
 * specifying dot is not mandatory
 *  /--> child
 *  
 *  xml-->Extensible markup language 
 *  
 *  path of element in XML tree--> xpath
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
		driver.findElement(By.xpath("./html/body/a")).click();
		goback(driver);
		driver.findElement(By.xpath("/html/body/a")).click();
	}

}

