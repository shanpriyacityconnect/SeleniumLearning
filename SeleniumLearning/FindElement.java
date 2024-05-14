package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElement {
	WebDriver driver;

	public FindElement(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(String Locator, String type) {
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("Element found by id : " + Locator);
			return this.driver.findElement(By.id(Locator));
		} else if (type.equals("xpath")) {
			System.out.println("Element found by xpath : " + Locator);
			return this.driver.findElement(By.xpath(Locator));
		} else if (type.equals("cssSelector")) {
			System.out.println("Element found by cssSelector : " + Locator);
			return this.driver.findElement(By.cssSelector(Locator));
		} else if (type.equals("partialLinktext")) {
			System.out.println("Element found by partialLinkText : " + Locator);
			return this.driver.findElement(By.partialLinkText(Locator));
		} else if (type.equals("linkText")) {
			System.out.println("Element found by linkText : " + Locator);
			return this.driver.findElement(By.linkText(Locator));
		} else if (type.equals("name")) {
			System.out.println("Element found by name : " + Locator);
			return this.driver.findElement(By.name(Locator));
		} else if (type.equals("tagName")) {
			System.out.println("Element found by tagName : " + Locator);
			return this.driver.findElement(By.tagName(Locator));
		} else {
			System.out.println("Locator type not valid");
			return null;
		}

	}

}
