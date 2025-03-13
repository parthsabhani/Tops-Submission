package com.module1;

public class EqualsAndCompareTo 
{
	public static void main(String[] args) 
	{
		String a = "Aello";
		String b = "Aello";
		
		/*
		 Equals 
		 It will check the value of the string. 
		*/
		if(a.equals(b))
		{
			System.out.println("Equals method.");
		}

		/*
		 Compare To
		 Difference b/t the first character 
		 If the first character is same it will check the next character of both string
		 If all character are same it will return 0 
		*/
		
		int x = a.compareTo(b);  
		System.out.println("Compare to : " + x);
	}
}
