package com.SeleniumLearning;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertionLearners {
	SoftAssertions sa = new SoftAssertions();
	
	@Test(priority=0)
	public void Test1(){
		String title = "amazon1";
		
Assert.assertFalse(title,true);
System.out.println("test1");
System.out.println("exectue");
		
	}
	@Test(priority=1)
	public void Test2(){
		String title = "amazon1";
Assert.assertFalse(title,false);
System.out.println("test2");
System.out.println("exectue");
		
	}
	@Test(priority=2)
	public void Test3(){
		String title = "amazon1";
		sa.assertEquals(title, "amazon");
		sa.assertEquals(title, "amazon1");
		System.out.println("exectued the testcase3");
		sa.assertAll();
		
	}
	
}
