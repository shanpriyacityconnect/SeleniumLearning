package com.SeleniumLearning;

import static org.junit.Assert.*;

import java.util.ArrayList;
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

public class WebElementDropdown {
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
	public void test() {

		WebElement element = driver.findElement(By.xpath("//select[@id='carselect']"));
		Select select = new Select(element);
		System.out.println("Dropdown display of Benz by value : ");
		select.selectByValue("benz");
		System.out.println("Dropdown display of BMW by VisibleText : ");
		select.selectByVisibleText("BMW");
		System.out.println("Dropdown display of Honda by Index : ");
		select.selectByIndex(2);

		System.out.println("To print list of all options");
		List<WebElement> options = new ArrayList<WebElement>();
		options = select.getOptions();
		int size = options.size();
		System.out.println(size);

		for (int i = 0; i < size; i++) {
			String selections = options.get(i).getText();
			System.out.println("Value is " + selections);
		}
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
