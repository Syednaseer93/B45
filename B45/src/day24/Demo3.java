package day24;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*File upload popup
 * 1. we cant inspect this popup
 * 2. we can move the popup
 * 3. when we click on choose file/browse button we get this popup
 * 4. purpose: select the file to be uploaded
 * 
 * Note: when we try to click on choose file/browse button using selenium we get InvalidArgumentException
 * 
 * How do u upload the file in selenium?
 * by specifying the absolute path of the file as arg to sendKeys
 * 
 * Note: we cant use relative path of the file in sendKeys
 * 
 * we convert relative path to absolute path using getAbsolutePath method of File class
 * 
 * Note2: we cant upload the file using drag and drop feature (not supported in selenium)
 * 
 */

public class Demo3 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("file:///F:/B45/Demo9.html");
		
		Thread.sleep(1000);
		
//		driver.findElement(By.id("A2")).sendKeys("F:\\B45\\Bhanu_5yrs_Automation.docx");
		
//		driver.findElement(By.id("A2")).sendKeys("./CV/Bhanu_5yrs_Automation.docx");
		
		File f=new File("./CV/Bhanu_5yrs_Automation.docx");
		String path = f.getAbsolutePath();
		driver.findElement(By.id("A2")).sendKeys(path);
	}


}
