package com.SeleniumLearning;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class facebooklearners {

	public static void main(String[] args) {
		try
		{
			;
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("incognito");
			options.addArguments("disable-infobars");
			//WebDriver driver2 = new RemoteWebDriver(new URL(url), desiredCapabilities);
			WebDriver driver = new ChromeDriver(options);
						
			//driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			WebElement element = driver.findElement(By.id("u_0_2"));
			element.click();
			
			WebElement element1 = driver.findElement(By.name("firstname"));
			element1.sendKeys("QAseleniumtest");
			WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
			Select select = new Select(month);
			List<WebElement> ls = new ArrayList<WebElement>();
			ls=select.getOptions();
			
			String mon=null;
	
			for(WebElement ls1:ls)
			{
				mon = ls1.getText();
				if(mon.equalsIgnoreCase("Aug"))
				{
					break;
					
				}
			}
			System.out.println(mon);
			WebElement wl = driver.findElement(By.cssSelector("input[name='firstname']"));
			
			Rectangle r=wl.getRect();
			int x = r.x;
			int y = r.y;
			
			System.out.println(x);
			System.out.println(y);
			Thread.sleep(1000);
			
			List<WebElement> radiobutton = driver.findElements(By.xpath("//*[@data-name='gender_wrapper']"));
			
			
			radiobutton.get(0).click();


			WebElement el2 = driver.findElement(By.xpath("//div[@class='mtm mbs _2_68' and contains(text(),'Gender')]"));
			System.out.println("Element is identified to mousehover");
			el2.click();
			Actions ac = new Actions(driver);
			ac.doubleClick(el2).build().perform();
			Thread.sleep(10000);
			driver.quit();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
