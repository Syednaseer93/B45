package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		
		driver.switchTo().frame("callout");
		driver.findElement(By.xpath("//button[.='No thanks']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(1000);
		//get all the auto suggestions 
		String xp="//span[starts-with(text(),'selenium')]";
		List<WebElement> allASE = driver.findElements(By.xpath(xp));
		
		
		//count the number of auto suggestions
		int count = allASE.size();
		System.out.println(count);
		
		//print all the auto suggestions
		for(WebElement element:allASE)
		{
			String text = element.getText();
			System.out.println(text);
		}
		
		Thread.sleep(1000);
		//select the last auto suggestion
		allASE.get(count-1).click();
	}

}
