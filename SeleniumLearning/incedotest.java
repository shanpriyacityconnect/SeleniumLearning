package com.SeleniumLearning;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class incedotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Desktop\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://a2z.aspiringminds.com/selenium/TpfdU_2B_2FCEdRD1AOfbnktaJleP_2F7QQpDyh5QaAufmE2yNLmwUzdf0EdUUNPCOQQP05iTJKvejhPF3_2BOcN2LujfWGlKRxsnJ0yfWdF0rWCLDo_3D/products");
		            // Read input from STDIN
		            // Read input from STDIN
		
		//System.out.println(upper); 
		WebElement el1 = driver.findElement(By.xpath("//input[@id='lower_range']"));
		WebElement el2 = driver.findElement(By.xpath("//input[@id='higher_range']"));
		el1.sendKeys("1000");
		el2.sendKeys("50000");
		List<WebElement> ls = driver.findElements(By.xpath("//div[@class='col-md-3 col-sm-6']"));
        int count =ls.size();
        System.out.println(count);
	}

}
