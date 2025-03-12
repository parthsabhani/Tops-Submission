package com.exception;

import java.util.Scanner;

public class ExceptionHandlingDemo1 
{
	public static void main(String[] args) 
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter no1: ");
			int a =sc.nextInt();
			System.out.print("Enter no2: ");
			int b =sc.nextInt();
			int c = a/b;
			System.out.println("Answer is " + c);
		
		}
		catch (Exception e)
		{
//			System.err.println(e);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Developer: @Tops");
		}
	}
}
