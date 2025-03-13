package com.module1;

public class StringPalindromeOrNot 
{
	public static void main(String[] args) 
	{
		String s = "Madam";
		String reverseString = "";
		
		for(int i=s.length()-1; i>=0;i--)
		{
			reverseString += s.charAt(i);
		}
		
		System.out.println("Original String : " + s);
		System.out.println("Reversed String : " + reverseString);
		
		if(reverseString.toLowerCase().equals(s.toLowerCase())) 
		{
			System.out.println("String is Palindrome.");
		}
		else
		{
			System.out.println("String is Not a Palindrome.");
		}
	}
}
