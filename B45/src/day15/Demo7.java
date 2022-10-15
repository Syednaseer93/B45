package day15;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*How to run a java script in browser manually
 * 1. open dev tool bar (F12)
 * 2. click on console tab
 * 3. type java script and press enter
 * 
 * How to run js in browser using selenium?
 * using executeScript method of JavascriptExecutor interface
 * 
 */
public class Demo7 {

	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();//up casting
		driver.get("https://www.google.com/");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("alert('Akshara');");//insert js to browser & runs it
	}

}














