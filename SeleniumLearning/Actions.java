package com.SeleniumLearning;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

		static WebDriver driver= new ChromeDriver();
		static String baseUrl="https://letskodeit.teachable.com/";

public static void main(String[] args) {
		driver.get(baseUrl);
		driver.manage().window().maximize();

	

	
		//1. Navigation
		driver.navigate().to("https://letskodeit.teachable.com/p/practice");
		// back to
		driver.navigate().back();
		// forward to
		driver.navigate().forward();
		// refresh
		driver.navigate().refresh();
		// To get Title
		String actualurl = driver.getTitle();
		// To get current url
		String expectedurl = driver.getCurrentUrl();
		// To get pagesource
		String pagesource = driver.getPageSource();

		System.out.println("Actual url is : " + actualurl);
		System.out.println("Expected url is : " + expectedurl);
//		System.out.println("pagesource  : " + pagesource);

	


		System.out.println("Test is successful");
}
}

