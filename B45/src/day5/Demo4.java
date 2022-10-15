package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo4 {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	
	public static void testBrowser(WebDriver driver)// it works on any browser
	{
		driver.get("http://www.google.com");//enter the url
		String title = driver.getTitle();//get the title of the page
		System.out.println(title);//print the title
		driver.quit();	//close the browser
	}
	
	
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();//open the browser
		Demo4.testBrowser(driver);
		
		WebDriver driver1=new FirefoxDriver();
		Demo4.testBrowser(driver1);
		
		

	}

}
