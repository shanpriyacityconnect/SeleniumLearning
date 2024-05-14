package com.SeleniumLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String url = "https://www.goibibo.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
		String partialtext = "del";
		String Texttobeselected = "Delhi, India(DEL)";
		System.out.println("Enter the partial text into the textbox");
//1. Identify the dropdown
		WebElement textbox = driver.findElement(By.id("gosuggest_inputSrc"));
		textbox.click();
//2.send the values to the textbox
		textbox.sendKeys(partialtext);
		System.out.println("Entered the value :" + partialtext);
//3.autocomplete element identified
		WebElement ui = driver.findElement(By.id("react-autosuggest-1"));
//4.get attribute of the autocomplete element
		String innerHTML = ui.getAttribute("innerHTML");
		System.out.println(innerHTML);
//5.from  innerhtml-attributes of the autocomplete element ,identify the list of elements using tagname - eg li  
		List<WebElement> li = ui.findElements(By.tagName("li"));
//6.using for loop get the individual element text 
		for (WebElement textoption : li) {
			if (textoption.getText().contains(Texttobeselected)) {
				System.out.println(textoption.getText());
				textoption.click();
				break;
			}

		}
		Thread.sleep(2000);
		driver.close();

	}
}
