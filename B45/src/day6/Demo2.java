package day6;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// give me an example for method overloading --> 
// driver.navigate().to(arg);    arg can be String or URL
//what is diff between get & navigate?

//get - only to enter url 
//navigate-- enter url, click back, forward & refresh 

//diff between get & navigate().to()

//'to' method internally calls get method

//get method is not overloaded but 'to' method is overloaded

//https://github.com/SeleniumHQ/selenium/blob/trunk/java/src/org/openqa/selenium/remote/RemoteWebDriver.java
//public void to(String url) {
//    get(url);
//  }

public class Demo2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		Thread.sleep(1000);//wait for 1 Sec
		
		driver.navigate().to("http://www.gmail.com");
		
		Thread.sleep(1000);
		
		
		URL url=new URL("http://www.fb.com");
		driver.navigate().to(url);
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		driver.quit();
	}
}