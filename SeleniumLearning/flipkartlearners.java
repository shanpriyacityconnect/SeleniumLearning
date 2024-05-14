package com.SeleniumLearning;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipkartlearners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Desktop\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.any)
		//String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
		//driver.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);
	//	((JavascriptExecutor) driver).executeScript("window.open()");
		
		driver.get("https://www.flipkart.com/clothing-and-accessories/topwear/tshirt/men-tshirt/pr?sid=clo,ash,ank,edy&otracker=categorytree&otracker=nmenu_sub_Men_0_T-Shirts");
		
		String parentwindow = driver.getWindowHandle();
		System.out.println("got parent handle"+parentwindow);
		SessionId ses = ((ChromeDriver)driver).getSessionId();
		System.out.println(ses.toString());
		Set<Cookie> cook = driver.manage().getCookies();
		
		System.out.println(cook);
		
		WebElement img = driver.findElement(By.xpath("//img[@title='Flipkart']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
        //use executeScript() method and pass the arguments 
        //Here i pass values based on css style. Yellow background color with solid red color border. 
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", img);
 
		Point pt=img.getLocation();
		int h =img.getSize().height;
		int w=img.getSize().width;
		System.out.println("h :"+h+" w : "+w);
		Dimension d = img.getSize();
		int hei= d.height;
		int wei = d.width;
		System.out.println("hei : "+hei+" wei : "+wei);
		System.out.println(img.getSize());
		int x = pt.getX();
		int y = pt.getY();
		System.out.println("x : "+x+" y : "+y);
		WebElement filtr = driver.findElement(By.xpath("//div[@class='_1xHtJz xufquN']"));
		System.out.println(filtr.getCssValue("font-size"));
		System.out.println(filtr.getCssValue("font-family"));
		System.out.println(filtr.getCssValue("font-colour"));
		System.out.println(filtr.getCssValue("color"));
		System.out.println(filtr.getCssValue("font-type"));
		System.out.println(filtr.getCssValue("font-weight"));
		System.out.println(filtr.getCssValue("background-colour"));
		WebElement el1 = driver.findElement(By.xpath("//img[@class='_3togXc'][1]"));
		if(el1.isDisplayed())
		{
			el1.click();	
		}		
		System.out.println("click image");
		driver.switchTo().window(parentwindow);
		List<WebElement> ls = driver.findElements(By.xpath("//div[@class='_1GEhLw']"));
		//div[@class='_2kFyHg _2mtkou']//descendant::label//div[@class='_1GEhLw' and text()='Wrangler']
		for(int i=0;i<ls.size();i++)
		{
		String brandname = ls.get(i).getText();
		if(brandname.equalsIgnoreCase("Lee"))
		{
			WebElement e = driver.findElement(By.xpath("//div[@class='_1GEhLw' and text()='"+brandname+"']"));
			e.click();
			System.out.println("lee selected");
			break;
		}
		}
		driver.quit();
	}

}
