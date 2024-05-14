package com.SeleniumLearning;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTestngsamp {

	@Test
	public void test1() {
		usefulmethod obj = new usefulmethod();
		int actual = obj.sumnumber(5, 1);
		System.out.println(actual);
		Assert.assertEquals(6, actual);
	}

	@Test
	public void test2() {
		usefulmethod obj = new usefulmethod();
		
	String s1="Selenium";
	String s2="Learning";
String s3 =obj.stringconcat(s1,s2);
			Assert.assertEquals("Hello World",s3 );
	}

	@Test
	public void test3() {
		usefulmethod obj = new usefulmethod();
		int[] actual = obj.decarray();
		System.out.println(actual);
		Assert.assertTrue("value of the array returns true", true);
	}
}
