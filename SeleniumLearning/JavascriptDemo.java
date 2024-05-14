package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. JavascriptExecutor is type casted for driver 2. window.location to get a
		 * page 3.it returns as object if we want to perform action on elements 4.return
		 * window.innerHeight & window.innerWidth enables to find the page height and
		 * width 5.window.scrollby(0,990) & window.scrollby(0,-990) to scroll up and
		 * down the page , scroll value should be greater then page height and width
		 * 6.argument[0].scrollIntoview(true) move/scroll to the element given
		 */

		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location='https://www.goibibo.com/';");

		WebElement element = (WebElement) js.executeScript("return document.getElementById('gosuggest_inputSrc');");
//        		   driver.findElement(By.id("gosuggest_inputSrc"));
		element.sendKeys("del");

		long pageheight = (Long) js.executeScript("return window.innerHeight;");
		System.out.println(pageheight);
		long pagewidth = (Long) js.executeScript("return window.innerWidth;");
		System.out.println(pagewidth);

		
		
	}

}
