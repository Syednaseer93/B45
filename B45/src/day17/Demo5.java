package day17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// select all the check boxes
//Home work: select alternative check box

// select only 1 and last check box using findElements

//select only 1 and last check box using findElement


public class Demo5 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/B45/Demo5.html");
		String xp="//input[@type='checkbox']";
		
		List<WebElement> allCB = driver.findElements(By.xpath(xp));
		int count= allCB.size();
		System.out.println("Number of Check Boxes:"+count);
		
		for(WebElement cb:allCB)
		{
			cb.click();
			Thread.sleep(500);
		}
		

		for(int i=count-1;i>=0;i-- )
		{
			allCB.get(i).click();
			Thread.sleep(500);
		}
	}

}
