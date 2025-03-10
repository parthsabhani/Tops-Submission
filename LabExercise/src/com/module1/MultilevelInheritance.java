package com.module1;

class A2
{
	public A2()
	{
		System.out.println("First Class");
	}
}

class B2 extends A2
{
	public B2()
	{
		System.out.println("Second Class");
	}
}

class GrandChild extends B2
{
	public GrandChild()
	{
		System.out.println("(Third Class) Grand Chhild");
	}
}

public class MultilevelInheritance 
{
	public static void main(String[] args) 
	{
		GrandChild gc = new GrandChild(); 
		A2 a = new A2();
		B2 b = new B2();
	}
}
