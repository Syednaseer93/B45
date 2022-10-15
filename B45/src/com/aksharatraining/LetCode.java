package com.aksharatraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LetCode {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in");
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		driver.findElement(By.xpath("//div/input[@name='email']")).sendKeys("javagalbhanu@gmail.com");
		driver.findElement(By.xpath("//div/input[@name='password']")).sendKeys("javagal");
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
        Thread.sleep(2000);
		String msg = driver.findElement(By.xpath("//div[@role='alertdialog']")).getText();
	    System.out.println(msg);
		driver.quit();
	}

}
