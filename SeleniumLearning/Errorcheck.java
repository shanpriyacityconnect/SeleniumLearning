package com.SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Errorcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("incognito");
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		System.out.println("browser launched");
		driver.close();
		System.out.println("first quit happened");
		driver.close();
	}

}
