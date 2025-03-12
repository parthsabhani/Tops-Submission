package com.module1;

class PC
{
	int id = 1;
	String name = "Krish";

	public PC(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("Id is : " + this.id);
		System.out.println("Name is : " + this.name);
	}
}

public class ParameterizedConstructor 
{
	public static void main(String[] args) 
	{
		PC c = new PC(2, "Raju");
		c.display();	
	}
}
