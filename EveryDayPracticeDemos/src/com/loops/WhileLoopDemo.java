package com.loops;

public class WhileLoopDemo 
{
	public static void main(String[] args) 
	{
		int i=5;
		while(i>0) // until the condition matches
		{
			System.out.print(i-- + " "); // post decrement i otherwise infinite loop 
		}
	}
}
