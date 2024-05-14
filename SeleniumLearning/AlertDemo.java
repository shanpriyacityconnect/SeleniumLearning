package com.SeleniumLearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
String url ="http://demo.guru99.com/popup.php";
driver.get(url);

WebElement element = driver.findElement(By.xpath("//a[@contains(text='Click Here')]"));
element.click();



Alert alert = driver.switchTo().alert();
alert.sendKeys("priya@email.com");
Thread.sleep(2000);
alert.accept();

Thread.sleep(2000);
driver.quit();

	}

}
