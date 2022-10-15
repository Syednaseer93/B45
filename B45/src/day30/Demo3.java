package day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*Can u use @FindBy to handle alert popup?
 * No
 * We cant inspect alert popup- we cant use locator - hence no @FindBy
 * 
 * Then how to u handle alert popup in POM class?
 * below code
 * 
 * if all the method of a class takes same argument then make it as global variable
 */
class BhanuPage
{
	private WebDriver driver;
	private Alert alert;
	
	@FindBy(id="A1")
	private WebElement submitBTN;
	
	BhanuPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickSubmit() {
		submitBTN.click();
	}
	
	
	
//	public void getAlertMsg(WebDriver driver) {
//		Alert alert = driver.switchTo().alert();
//		String msg=alert.getText();
//		System.out.println(msg);
//	}
//	
//	public void clickOkOnAlert(WebDriver driver) {
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//	}
//	
//	public void clickCancelOnAlert(WebDriver driver) {
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
//	}
	
	public void switchToAlert() {
	
		if(alert==null) {
			alert = driver.switchTo().alert();
		}
		else
		{
			System.out.println("already switched");
		}
		
		
	}
	
	public void getAlertMsg() {
		switchToAlert();
		String msg=alert.getText();
		System.out.println(msg);
	}

	public void clickOkOnAlert() {
		switchToAlert();
		alert.accept();
	}

	public void clickCancelOnAlert() {
		switchToAlert();
		alert.dismiss();
	}
}

public class Demo3 {//Test Class
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///F:/B45/Demo9.html");
		BhanuPage b=new BhanuPage(driver);
		Thread.sleep(1000);
		b.clickSubmit();
		Thread.sleep(1000);
		b.getAlertMsg();
		Thread.sleep(1000);
		b.clickOkOnAlert();
		Thread.sleep(1000);
		driver.quit();
	}
}











