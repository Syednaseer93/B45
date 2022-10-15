package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/* findElement returns WebElement
 * in WebElement we following methods to get html info on the element
 * getTagName
 * getAttribute
 * getText
 */
public class Demo3 {

	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	
		driver.get("file:///F:/B45/Day14%2016-06-2022/Element.html");
	
		WebElement element = driver.findElement(By.id("A2"));
		
		String tag = element.getTagName();
		System.out.println(tag);

		String href=element.getAttribute("href");
		System.out.println(href);
		
		String text=element.getText();
		System.out.println(text);
		
		driver.quit();
	}

}
