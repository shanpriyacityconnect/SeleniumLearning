package com.SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letskodeit.teachable.com/p/practice");
	List<WebElement> radios=driver.findElements(By.xpath("//input[contains(@type,'radio') and @name='cars']"));
		int size = radios.size();
		System.out.println(size);
	for(WebElement sel : radios)
	{
		sel.click();
		Thread.sleep(2000);
		System.out.println("radio button is selected : " + sel.isSelected() );
	}
		driver.quit();
	
	}

}
