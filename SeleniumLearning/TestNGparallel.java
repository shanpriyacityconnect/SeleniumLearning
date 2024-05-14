package com.SeleniumLearning;
import com.beust.jcommander.Parameter;

import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGparallel {

	
	@Test(enabled = false)
	public void Test1(){
		System.setProperty("webdriver.chrome.driver","E:\\Desktop\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
		
		
	}
	@Test(groups = {"smoke"})
	@Parameters("myname")
	public void Test2(String myname){
		System.setProperty("webdriver.chrome.driver","E:\\Desktop\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		System.out.println("my name "+myname);
		
	}
	
	@Test(groups = {"smoke"})
	@Parameters("myname")
		public void Test3(String myname){
		System.setProperty("webdriver.chrome.driver","E:\\Desktop\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		System.out.println("my name "+myname);
		
	}
	@Test
	public void Test4(){
		System.setProperty("webdriver.chrome.driver","E:\\Desktop\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
	}
	@Test(dependsOnMethods= {"Test4"})
	public void Test5(){
		System.setProperty("webdriver.chrome.driver","E:\\Desktop\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
	}
	@Test
	@Parameters("myname")
	public void Test6(String myname){
		System.out.println("my name "+myname);
		System.out.println("test6");
	}
	@Test
	@Parameters("myname")
	public void Param1(String myname){
		System.out.println("my name1 "+myname);
		System.out.println("test7");
	}
	@Test(invocationCount = 5)
	public void Param(String myname){
		System.out.println("my name1 "+myname);
		System.out.println("test7");
	}
	
}
