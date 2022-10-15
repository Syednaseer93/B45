package day15;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Taking the screenshot of complete page 
 * 1. we can take screen shot of an element / area/ visible area of page
 * 2. Not possible- Desktop screenshot , hidden section of the page (scroll take the screen)
 * 3. we can use Robot class of awt (abstract window toolkit) package 
 * 
 */
public class Demo6 {

	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		WebDriver driver=new ChromeDriver();//up casting
		driver.get("https://www.actitime.com/");
		Robot robot=new Robot();
		Dimension ss = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle r=new Rectangle(ss);
		BufferedImage img = robot.createScreenCapture(r);
		ImageIO.write(img, "bmp",new File("./img/desktop.bmp"));
		driver.quit();
	}

}
