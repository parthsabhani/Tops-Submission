package com.module1;

public class TryCatchExercise 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("We are dividing 10 by 0");
			int x = 10/0; // Dividing by zero : ArithmeticException
			System.out.println(x); // this line will skip
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Program ended..");
		}
	}
}
