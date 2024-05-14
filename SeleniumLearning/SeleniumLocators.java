package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com");
		driver.manage().window().maximize();
		// find element by linktext
		
		WebElement element = driver.findElement(By.linkText("Practice"));

		element.click();
		Thread.sleep(1000);
	WebElement element1 = driver.findElement(By.xpath("//input[starts-with(@class,'inputs')]"));
	element1.sendKeys("Hello");
	}

}
