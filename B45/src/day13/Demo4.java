package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Demo4 {

	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///F:/B45/Day13%2015-06-2022/Table3.html");
		
		Thread.sleep(1000);
		WebElement java = driver.findElement(By.xpath("//td[.='Java']"));
//		driver.findElement(with(By.tagName("input")).toRightOf(java)).click();
		
		driver.findElement(with(By.tagName("input")).near(java)).click();
		
		Thread.sleep(1000);
		
		
		driver.get("file:///F:/B45/Day13%2015-06-2022/Table4.html");
		
		Thread.sleep(1000);
		java = driver.findElement(By.xpath("//td[.='Java']"));
//		driver.findElement(with(By.tagName("input")).toLeftOf(java)).click();
		driver.findElement(with(By.tagName("input")).near(java)).click();
		Thread.sleep(1000);
		
		
		driver.quit();
	}

}
