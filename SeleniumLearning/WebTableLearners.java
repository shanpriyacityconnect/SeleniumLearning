package com.SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableLearners {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Desktop\\SeleniumDrivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://www.goodreturns.in/gold-rates/chennai.html");
		System.out.println("hi");
		// driver.get("https://www.goodreturns.in/gold-rates/chennai.html"); 
		 //System.out.println("hi");
		 WebElement  el1 =  driver.findElement(By.xpath("//div[@class='gold_silver_table']//table/tbody")
		  ); 
		 List<WebElement> el2 = el1.findElements(By.tagName("tr")); 
		 WebElement el3 = driver.findElement(By.xpath("//div[@class='gold_silver_table']//table/tbody/tr"));
		 List<WebElement> el4 = el3.findElements(By.tagName("td"));
		 System.out.println(el2.size());
		  System.out.println(el4.size()); 
		  for(int i =2 ;i<=el2.size();i++) 
		  {
			  for(int j=1;j<=el4.size();j++) 
			  {
				  WebElement el5 = driver.findElement(By.xpath( "//div[@class='gold_silver_table']//table/tbody/tr["+i+"]/td["+j+"]"));
		  System.out.println(el5.getText().replaceAll("[^A-za-z0-9]", "")); } }
		 
	}

}
