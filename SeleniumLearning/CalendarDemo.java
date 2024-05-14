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

public class CalendarDemo {
WebDriver driver;
	@Before
	public void setUp() throws Exception {
		WebDriver driver = new ChromeDriver();
		String url="https://www.expedia.com/?pwaLob=wizard-hotel-pwa-v2";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
	}
	@Test
	public void test() {
	WebElement tab = driver.findElement(By.xpath("//a[@href='?pwaLOB=wizard-flight-pwa']"));
	
	//*[@id=\"uitk-tabs-button-container\"]/li[2]/a/span
	tab.click();
	WebElement datesel= driver.findElement(By.xpath("@contains[class='uitk-new-date-picker-day' and data-day='12']"));
	datesel.click();
	System.out.println("Date is selected" + datesel.getAttribute("12"));
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	

}
