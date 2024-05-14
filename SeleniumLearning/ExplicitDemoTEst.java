package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitDemoTEst {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String url = "https://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
		try {
			GenericExplicitdemo ele = new GenericExplicitdemo(driver);
			WebElement box = ele.getwaitvisibility(By.id("name"), 10);
			System.out.println("waiting for the page...");
			System.out.println("Waiting for element");
			System.out.println("Element is enabled " + box.isEnabled());
			box.sendKeys("seleniumTest");
		} catch (Exception e) {
			System.out.println("Invalid selection");
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
