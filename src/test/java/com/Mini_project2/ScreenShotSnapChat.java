package com.Mini_project2;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotSnapChat {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Flynn Ryder\\eclipse-workspace\\Mini_project2\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://accounts.snapchat.com/accounts/login?continue=https%3A%2F%2Faccounts.snapchat.com%2Faccounts%2Fwelcome");
		wd.manage().window().maximize();
		Thread.sleep(3000);
		
		wd.findElement(By.id("username")).sendKeys("Miniproject");
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		wd.findElement(By.name("password")).sendKeys("Abcd@1234");
		Thread.sleep(3000);
		
		WebElement sign = wd.findElement(By.xpath("//button[@type='submit']"));
		sign.click();
		Thread.sleep(10000);
		
		TakesScreenshot shot = (TakesScreenshot) wd;
		File sou = shot.getScreenshotAs(OutputType.FILE);
		File Des = new File("C:\\Users\\Flynn Ryder\\eclipse-workspace\\Mini_project2\\ScreenShot\\shot1.png");
		FileUtils.copyFile(sou, Des);
		
		Thread.sleep(3000);
		wd.quit();
	}
}