package com.module1;

class A1
{
	public A1()
	{
		System.out.println("Parent Class");
	}
}

class C1 extends A1
{
	public C1() 
	{
		System.out.println("Child 1");
	}
}

class C2 extends A1
{
	public C2() 
	{
		System.out.println("Child 2");
	}
}

public class HierarchicalInheritance 
{
	public static void main(String[] args) 
	{
		A1 a = new A1(); 
		C1 c1 = new C1();
		C2 c2 = new C2();
	}
}
