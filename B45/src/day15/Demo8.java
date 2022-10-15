package day15;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo8 {

	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();//up casting
		driver.get("https://www.actimind.com/");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		for(int i=1;i<=4;i++) {
			j.executeScript("window.scrollBy(0,500)"); //scroll down 500px
			Thread.sleep(1000);
		}
		
		for(int i=1;i<=5;i++) {
			j.executeScript("window.scrollBy(0,-500)");//scroll up 500px
			Thread.sleep(1000);
		}
		
		j.executeScript("window.scrollTo(0,1000)");
	}

}














