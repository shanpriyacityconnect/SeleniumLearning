package com.SeleniumLearning;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazonautomation {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
		//driver.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);
	//	((JavascriptExecutor) driver).executeScript("window.open()");
	
		driver.get("https://www.amazon.com/");
		WebElement we = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-us']"));
		
		Thread.sleep(3000);
		WebElement we1 = driver.findElement(By.xpath("//div[@id='nav-flyout-icp']//div[contains(text(),'Change country/region.')][1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", we1);
		Thread.sleep(3000);
		WebElement we2 = driver.findElement(By.xpath("//select[@id='icp-selected-country']"));		
		Select sel = new Select(we2);
		List<WebElement> ls= sel.getOptions();
		System.out.println(ls.size());
		for(int i=1;i<ls.size();i++)
		{
			if(ls.get(i).getAttribute("text").equalsIgnoreCase("India"))
			{
				sel.selectByIndex(i);
				WebElement we3 = driver.findElement(By.xpath("//a[@id='icp-selected-country_"+(i-1)+"']"));
				we3.click();
				break;
			}
		}
		WebElement we3 = driver.findElement(By.xpath("//span[@class='a-button-text']"));
		js.executeScript("arguments[0].click();", we3);
		Thread.sleep(3000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());
		for(int i =0; i<tabs.size();i++)
		{			driver.switchTo().window(tabs.get(i));
			if(driver.getTitle().contains("Amazon.in"))
			{
				break;
		}
		}	
		
		//driver.switchTo().parentFrame();
	//	String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_T);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyRelease(KeyEvent.VK_T);
		driver.quit();
		}
}