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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdown {
	static WebDriver driver = new ChromeDriver();
	static String baseUrl = "https://letskodeit.teachable.com/p/practice/";

	@Before
	public void setUp() throws Exception {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	}

	@Test
	public void test() {
		
		//select is the mandatory look up for dropdown
		WebElement dropdown = driver.findElement(By.xpath("//select(@id='carselect')"));
		Select select = new Select(dropdown);
		
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}

}
