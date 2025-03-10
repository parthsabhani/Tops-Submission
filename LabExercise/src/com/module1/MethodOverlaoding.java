package com.module1;

public class MethodOverlaoding 
{
	int n1 =10;
	int n2 =20;
	
	public void add()
	{
		System.out.println(n1+n2);
	}
	
	public float add(float n1, int n2) 
	{
		System.out.print("float and int: ");
		return (n1+ n2);
	}
	
	public double add(double n1, float n2) 
	{
		System.out.print("double and float: ");
		return (n1+ n2);
	}
	
	public long add(long n1, int n2) 
	{
		System.out.print("long and int: ");
		return (n1+ n2);
	}
	
	
	
	public static void main(String[] args) 
	{
		MethodOverlaoding o = new MethodOverlaoding();
		System.out.println(o.add(41236,59));
		System.out.println(o.add(4,5));
		System.out.println(o.add(4.1,5.00f));
		System.out.println(o.add(4.1f,5));
	}	
}
