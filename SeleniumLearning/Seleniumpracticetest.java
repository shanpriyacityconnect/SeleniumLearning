package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpracticetest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://formy-project.herokuapp.com/form");
		// find element by id
		WebElement element = driver.findElement(By.id("first-name"));

		element.sendKeys(ExcelReader.getvalue("Firstname"));
		System.out.println("The element identified by id" + element.getText());
		// find element by name
		WebElement element1 = driver.findElement(By.id("last-name"));
		element1.sendKeys("kali");
		System.out.println("The element identified by name" + element1.getText());
		WebElement element2 = driver.findElement(By.xpath("//input[@placeholder='Enter your job title']"));
		element2.sendKeys("developer");
		System.out.println("The element identified by name" + element2.getText());

//driver.close();
	}

}
