package com.SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectthirdlinkSearchpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url="http://www.google.com";
		driver.get(url);
	WebElement ele=driver.findElement(By.xpath("//input[@name='q']"));	
		ele.sendKeys("cheese");
		ele.submit();
		Thread.sleep(5000);
		 List<WebElement> findElements = driver.findElements(By.xpath("//h3[@class='r']"));

		    // this are all the links you like to visit
		    for (WebElement webElement : findElements)
		    {
		        System.out.println(webElement.getAttribute("href"));
		    }
		    Thread.sleep(5000);
		  //scroll the page using javascript
		    JavascriptExecutor js = ((JavascriptExecutor) driver);
		    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		    
		
		
//	    
//		List<WebElement> links = driver.findElements(By.xpath("//h3[@class='r']//a"));
//		WebElement link= driver.findElement(By.xpath("//h3[contains(text(),'r']//a"));
//		System.out.println(link);
//		link.click(); //*[@id="rso"]/div[3]/div/div[1]/a/h3
//		WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));
//
//	    List<WebElement> findElements = driver.findElements(By.xpath("//h3[@class='r']//a"));
//
//	    //Get the url of third link and navigate to it
//	    String third_link = links.get(0).getAttribute("href");
//	    System.out.println(third_link);
//	    driver.navigate().to(third_link);
	    
	   
	    
	}

}
