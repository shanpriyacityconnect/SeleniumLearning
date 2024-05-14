package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
String url="https://letskodeit.teachable.com/p/practice";
String url1="https://jqueryui.com/droppable/";
String url2="https://jqueryui.com/slider/";

driver.get(url);
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,900)");
WebElement element = driver.findElement(By.id("mousehover"));
Actions action = new Actions(driver);
action.moveToElement(element).perform();
WebElement subelement = driver.findElement(By.xpath("//div[@class='mouse-hover-content']//a[text()='Top']"));
action.moveToElement(subelement).click().perform();

Thread.sleep(3000);

driver.navigate().to(url1);
js.executeScript("window.scrollBy(0,400)");
WebElement from,to;
driver.switchTo().frame(0);
from=driver.findElement(By.id("draggable"));//p[text()='Drag me to my target']"));
to=driver.findElement(By.id("droppable"));

//from =(WebElement) js.executeScript("return document.getElementById('draggable');");
//to=(WebElement) js.executeScript("return document.getElementById('droppable');");
//Thread.sleep(3000);
//js.executeScript("arguments[0].click();",from);
//System.out.println("clicked on the element");
action.clickAndHold(from).moveToElement(to).release().build().perform();
System.out.println("successful click and move");

Thread.sleep(3000);

action.dragAndDrop(to, from).build().perform();
System.out.println("successful Drag and drop");
Thread.sleep(3000);

driver.navigate().to(url2);
js.executeScript("window.scrollBy(0,400)");
driver.switchTo().frame(0);

WebElement elem =driver.findElement(By.id("slider"));
action.dragAndDropBy(elem, 5000, 0).build().perform();
Thread.sleep(4000);
System.out.println("successful");
driver.quit();


	}

}
