package com.SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Testng {
	
	  @Test(enabled=false) 
	  public void Test1(){
		  
	  System.setProperty("webdriver.chrome.driver","E:\\Desktop\\SeleniumDrivers\\chromedriver.exe"); 
	  WebDriver driver = new  ChromeDriver(); 
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.com/"); String title = driver.getTitle();
	  System.out.println("test1"); Assert.assertEquals(title,
	  "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"
	  );
	  
	  }
	  
	  @Test(enabled = true) 
	  public void Test2()
	  {
	  System.setProperty("webdriver.chrome.driver",
	  "E:\\Desktop\\SeleniumDrivers\\chromedriver.exe"); WebDriver driver = new
	  ChromeDriver(); driver.manage().window().maximize();
	  driver.get("https://www.amazon.com/"); System.out.println("test2");
	  
	  }
	  
	  @Test(dependsOnMethods= {"Test4"}) public void Test3(){
	  System.setProperty("webdriver.chrome.driver",
	  "E:\\Desktop\\SeleniumDrivers\\chromedriver.exe"); WebDriver driver = new
	  ChromeDriver(); driver.manage().window().maximize();
	  driver.get("https://www.amazon.com/"); System.out.println("test3");
	  
	  }
	  
	  @Test public void Test4()
	  { System.setProperty("webdriver.chrome.driver",
	  "E:\\Desktop\\SeleniumDrivers\\chromedriver.exe"); WebDriver driver = new
	  ChromeDriver(); driver.manage().window().maximize();
	  driver.get("https://www.amazon.com/"); System.out.println("test4"); }
	 
	  @Test public void Test5()
	  { System.setProperty("webdriver.chrome.driver",
	  "E:\\Desktop\\SeleniumDrivers\\chromedriver.exe"); WebDriver driver = new
	  ChromeDriver(); driver.manage().window().maximize();
	  driver.get("https://www.amazon.com/"); System.out.println("test4"); }
	
	
	@Test(dataProvider="SearchProvider")
    public void testMethod(String author,String searchKey) throws InterruptedException{
    {
    	System.setProperty("webdriver.chrome.driver","E:\\Desktop\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
    	driver.get("https://google.com");
    	WebElement searchText = driver.findElement(By.name("q"));
        //search value in google searchbox
        searchText.sendKeys(searchKey);
        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
        Thread.sleep(3000);
        String testValue = searchText.getAttribute("value");
        System.out.println(testValue +"::::"+searchKey);
        searchText.clear();
        //Verify if the value in google search box is correct
        Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
    }
    }
    /**
     * @return Object[][] where first column contains 'author'
     * and second column contains 'searchKey'
     */

    @DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(){
    return new Object[][] 
    	{
            { "Guru99", "India" },
            { "Krishna", "UK" },
            { "Bhupesh", "USA" }
        };

}
}
