package com.SeleniumLearning;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*Selenium driver implicit & explicit 
explicit wait - wait till the certain condition is wait
Important condition on explicit 
-visibility of element located
-presence of element located
-Element to be clickable 
implicit - it will make webdriver to poll the DOM,recursive check till the given time 

*/
public class WaitMethods {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new ChromeDriver();
		String url = "https://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
	}

	@Test
	public void testvisibity() {
		GenericExplicitdemo ele = new GenericExplicitdemo(driver);
		WebElement box = ele.getwaitvisibility(By.id("name"),10);
		System.out.println("waiting for the page...");
		System.out.println("Waiting for element");
		System.out.println("Element is enabled " + box.isEnabled());
		box.sendKeys("seleniumTest");

	}

	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
