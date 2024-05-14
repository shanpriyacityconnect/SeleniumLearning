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

public class WebElementRadioButtons {

	WebDriver driver;
	String baseURL="https://letskodeit.teachable.com/p/practice";

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
				driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		Boolean ischecked = false;
	
		List<WebElement> radiobuttons=driver.findElements(By.xpath("//input[contains(@type,'radio') and @name='cars']"));
		int size = radiobuttons.size();
		System.out.println(size);
	
		System.out.println("list of elements in it is : " + size);
		for (int i = 0; i <size; i++) {

			ischecked = radiobuttons.get(i).isSelected();
			if (!ischecked) {
				radiobuttons.get(i).click();
				
				
			      System.out.println(radiobuttons.get(i).getAttribute("value")+ "radio button is selected" + radiobuttons.get(i).isSelected());
			}

		}

	}

	@After
	public void tearDown() throws Exception  {
		Thread.sleep(2000);
		driver.quit();
	}

}
