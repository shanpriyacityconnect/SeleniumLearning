package com.SeleniumLearning;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementHideButton {
	WebDriver driver;
	String baseURL = "https://letskodeit.teachable.com/p/practice";
	String baseURL1 = "https://www.expedia.com/?pwaLob=wizard-hotel-pwa-v2";
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	
	@Test
	public void testExpedia() {
		driver.get(baseURL1);
		
		WebElement package1 = driver.findElement(By.id("tab-package-tab-hp"));
		System.out.println("Click on package tab");
		package1.click();
//		WebElement elem1 =driver.findElement(By.xpath("//button[@contains(type,'button') and @title='uitk-step-increase-children-861-title']"));
//		elem1.click();
	}
	
	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(3000);
//		driver.quit();
	}


}
