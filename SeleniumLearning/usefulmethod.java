package com.SeleniumLearning;

public class usefulmethod {

	public int sumnumber(int a, int b) {
		int c = a + b;
		System.out.println("addition of 2 nos : " + c);
		return c;

	}

	public String stringconcat(String s1, String s2) {
		String s3 =s1.concat(s2);
		System.out.println("String concatenation : " + s3);
return s3;
	}

	public int[] decarray() {
		int[] a1 = {2,4,6,2};
		return a1;
	}
	
}
