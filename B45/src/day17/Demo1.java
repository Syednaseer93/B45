package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*1. for security reason , elements are protected using shadow root
 *2. out element will be a decorator , inner element will be the actual element
 *3. to access the element which is inside the shadow root we use  getShadowRoot()
 *4. getShadowRoot method returns  SearchContext (parent of WebDriver)
 *5. it has 2 methods findElement and findElements 
 */
public class Demo1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com");
//		driver.findElement(By.id("input")).sendKeys("Java");
		
		SearchContext shadowRoot = driver.findElement(By.tagName("book-app")).getShadowRoot();
		shadowRoot.findElement(By.id("input")).sendKeys("java");
		
	}

}
