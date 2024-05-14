package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
String url="https://letskodeit.teachable.com/p/practice";
driver.get(url);
driver.switchTo().frame(0);
WebElement newwindow = driver.findElement(By.id("search-courses"));
newwindow.sendKeys("Python");

Thread.sleep(3000);
System.out.println("Bhuvi got job");
driver.quit();

	}

}
