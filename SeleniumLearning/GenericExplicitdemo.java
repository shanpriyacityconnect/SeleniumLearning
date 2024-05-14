package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericExplicitdemo {
	WebDriver driver;

	public GenericExplicitdemo(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getwaitvisibility(By locator, int timeout) {
		WebElement e1 = null;
		try {
			System.out.println(" Looking up for the element in " + timeout + " seconds");
			WebDriverWait wait = new WebDriverWait(driver,timeout);
			e1 = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (Exception e) {
			System.out.println("Element not found ");
		}
		return e1;

	}
}
