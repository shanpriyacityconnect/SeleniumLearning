package com.SeleniumLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarnewDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String url = "https://www.goibibo.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
		System.out.println("Selecting the dates");

		WebElement departurecal = driver.findElement(By.id("departureCalendar"));
		departurecal.click();

		System.out.println("Clicked on the departuredate tab");
		List<WebElement> datelist = driver.findElements(By.xpath("//*[@class='DayPicker-Day']"));
		for (WebElement option : datelist) {
			
			String dateselected = option.getText();
			if (dateselected.equals("9")) {
				option.click();
			}
			System.out.println("Departure date is selected");
			break;
		}

		WebElement returndate = driver.findElement(By.id("returnCalendar"));
		returndate.click();

		System.out.println("Clicked on the Returndate tab ");
		String month = "08";
		String redate = "31";
		WebElement returncal = driver.findElement(By.id("fare_2020" + month + redate + ""));
		returncal.click();
		System.out.println("Return date is selected");
	}

}
