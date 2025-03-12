package com.loops;

public class DoWhileLoopDemo 
{
	public static void main(String[] args) 
	{
		int i=5; 
		do // run at least once whether a condition is true or not 
		{
			System.out.println(i--); // post decrement
		}
		while(i > 5); // condition check after the first execution of do block
	}
}
