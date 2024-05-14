package com.SeleniumLearning;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementMultipleDropdown {

	WebDriver driver;
	String baseURL = "https://letskodeit.teachable.com/p/practice";

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		WebElement elem = driver.findElement(By.id("multiple-select-example"));
		Select select = new Select(elem);
		Thread.sleep(2000);
		System.out.println(" select Apple by value");
		select.selectByValue("apple");
		
		Thread.sleep(2000);
		System.out.println(" De-select Apple by value");
		select.deselectByValue("apple");

		Thread.sleep(2000);
		System.out.println(" select Orange by visible text");
		select.selectByVisibleText("Orange");
		
		Thread.sleep(2000);
		System.out.println(" select Peach by index");
		select.selectByIndex(2);
		

		Thread.sleep(2000);
		System.out.println("Select multiple values in the dropdown");
		List<WebElement> optionssel = select.getAllSelectedOptions();
		for (WebElement options : optionssel) {
			System.out.println(options.getText());
		}

		Thread.sleep(2000);
		System.out.println("DeSelect all values in the dropdown");
		select.deselectAll();

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
