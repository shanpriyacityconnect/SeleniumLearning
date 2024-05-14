package com.SeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class invoc {
	@Test(invocationCount = 3, threadPoolSize =3)
	public void Param(){
		//System.out.println("my name1 "+myname);
		System.setProperty("webdriver.chrome.driver","E:\\Desktop\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
    	driver.get("https://google.com");
		System.out.println("test7");
	}
}
