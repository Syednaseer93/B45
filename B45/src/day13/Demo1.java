package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///F:/B45/Day13%2015-06-2022/Table3.html");
		Thread.sleep(1000);
		String xp1="//td[.='Java']/../td[3]/input";
		driver.findElement(By.xpath(xp1)).click();
		Thread.sleep(1000);
		String xp2="//td[.='SQL']/..//input";
		driver.findElement(By.xpath(xp2)).click();
		Thread.sleep(1000);
		driver.get("file:///F:/B45/Day13%2015-06-2022/Table4.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath(xp2)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(xp1)).click();//NSEE
	}

}
