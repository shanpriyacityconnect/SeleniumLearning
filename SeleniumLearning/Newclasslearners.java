package com.SeleniumLearning;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.ApplicationCache;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Newclasslearners {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","E:\\Desktop\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/clothing-and-accessories/topwear/tshirt/men-tshirt/pr?sid=clo,ash,ank,edy&otracker=categorytree&otracker=nmenu_sub_Men_0_T-Shirts");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Actions action = new Actions(driver);
//		action.sendKeys(Keys.chord(Keys.CONTROL,"T")).build().perform();
//		Robot rb = new Robot();
//		 
//		// Press control keyboard key
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		 
//		// Press A keyboard key
//		rb.keyPress(KeyEvent.VK_T);
//		rb.keyRelease(KeyEvent.VK_T);
//		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "t");
		
		driver.quit();
		

	}

}
