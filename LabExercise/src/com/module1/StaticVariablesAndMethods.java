package com.module1;

class Project
{
	static long pid =10;
	static String name = "Uber";
	
	public static void getPoject() 
	{
		System.out.println("Name of Project: " + name);
		System.out.println("Project id: " + pid);
	}
}

public class StaticVariablesAndMethods 
{
	public static void main(String[] args) 
	{
		Project p = new Project();
		p.pid = 1;  // get static variable with object ref
		Project.pid =1; // get static variable with class name
		
		p.getPoject(); // get static method with object ref
		Project.getPoject(); // get static method with class name
	}
}
