package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/* findElement returns WebElement
 * in WebElement we following methods to perform validation on the element
*1. isDisplayed - any element
*2. isEnabled  - any element
*3. isSelected - check box, radio button & list box option
 */
public class Demo2 {

	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	
		driver.get("file:///F:/B45/Day14%2016-06-2022/Element.html");
	
		boolean v1 = driver.findElement(By.id("A1")).isDisplayed();
		System.out.println(v1);//true-visible
		
		boolean v2 = driver.findElement(By.id("A3")).isDisplayed();
		System.out.println(v2);//false-not visible
	
		boolean v3 = driver.findElement(By.id("A1")).isEnabled();
		System.out.println(v3);//true- enabled
		
		boolean v4 = driver.findElement(By.id("A4")).isEnabled();
		System.out.println(v4);//false- disabled
		
		boolean v5=driver.findElement(By.id("A5")).isSelected();
		System.out.println(v5);//true-- selected
		
		boolean v6=driver.findElement(By.id("A6")).isSelected();
		System.out.println(v6);//false - not selected
		
		driver.quit();
	}

}
