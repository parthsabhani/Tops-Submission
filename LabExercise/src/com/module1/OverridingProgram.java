package com.module1;

class FirstClass
{
	public void method1()
	{
		System.out.println("First class Method");
	}
}

class SecondClass extends FirstClass
{
	public void method1()
	{
		System.out.println("Second class Method ");
	}
}

public class OverridingProgram 
{
	public static void main(String[] args) 
	{
		SecondClass s = new SecondClass();
		s.method1(); // Override method in First Class
	}
}
