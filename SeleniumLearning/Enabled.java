package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String data ="Good-morning"; 
		WebElement elem1 = driver.findElement(By.name("q"));
		Boolean find =elem1.isEnabled();
		if(find)
		{elem1.sendKeys(data);
		System.out.println("Entered the data :" +data);
		System.out.println(find);
		}
		else
		{
			System.out.println("Data is not entered");
			
		}
	}

}
