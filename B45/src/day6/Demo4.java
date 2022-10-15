package day6;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//primitive - byte ,short,int,long, float,double,boolean & char
//non primitive --> String, Demo4, Array,Dimension,WebDriver,ChromeDriver
public class Demo4 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//get the current size of the browser & print it
		Dimension s = driver.manage().window().getSize();
		System.out.println(s);
		Thread.sleep(1000);
		
		//resize the browser
		Dimension d=new Dimension(300,400);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		
		
		//get the current location/position of the browser & print it 
		Point p1 = driver.manage().window().getPosition();
		System.out.println(p1);
		
		//reposition the browser
		Point p=new Point(400,50);
		driver.manage().window().setPosition(p);
	}
}