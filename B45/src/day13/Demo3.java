package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Demo3 {

	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///F:/B45/Day13%2015-06-2022/Table3.html");
		Thread.sleep(1000);
		WebElement nn = driver.findElement(By.xpath("//td[.='99']"));
		
		String text=driver.findElement(with(By.tagName("th")).above(nn)).getText();
		System.out.println(text);
		
		text=driver.findElement(with(By.tagName("td")).below(nn)).getText();
		System.out.println(text);
		
		driver.findElement(with(By.tagName("input")).toRightOf(nn)).click();
		
		text=driver.findElement(with(By.tagName("td")).toLeftOf(nn)).getText();
		System.out.println(text);
		
		driver.quit();
	}

}
