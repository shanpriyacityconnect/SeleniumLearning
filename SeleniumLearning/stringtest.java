package com.SeleniumLearning;

public class stringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="priyatest";
		byte[] arr=s.getBytes();
		byte[] result=new byte[arr.length];
		for (int i=0;i<arr.length;i++)
		{
		result[i] =arr[arr.length-i-1];
		
		}
		System.out.println(new String(result));
	}

}
