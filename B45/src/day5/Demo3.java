package day5;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	
	public static void testBrowser(ChromeDriver driver)
	{
		driver.get("http://www.fb.com");//enter the url
		String title = driver.getTitle();//get the title of the page
		System.out.println(title);//print the title
		driver.quit();	//close the browser
	}
	
	public static void testBrowser(FirefoxDriver driver)
	{
		driver.get("http://www.fb.com");//enter the url
		String title = driver.getTitle();//get the title of the page
		System.out.println(title);//print the title
		driver.quit();	//close the browser
	}
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();//open the browser
		Demo3.testBrowser(driver);
		
		FirefoxDriver driver1=new FirefoxDriver();
		Demo3.testBrowser(driver1);
		
		

	}

}
