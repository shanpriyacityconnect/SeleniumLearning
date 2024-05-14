package com.SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class RightClickAndDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		String url = "http://demo.guru99.com/test/simple_context_menu.html";
		driver.get(url);
		WebElement element1 = driver.findElement(By.xpath("//*[@id='authentication']/button"));
		Actions action = new Actions(driver);
		action.doubleClick(element1).perform();
		
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		String textmessage = alert.getText();
		System.out.println(textmessage);
		alert.dismiss();
		
	}

}
