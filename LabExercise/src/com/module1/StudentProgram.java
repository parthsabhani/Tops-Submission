package com.module1;

class Student 
{
	String name = "Parth";
	int age = 21;
	public void display()
	{
		System.out.println("Student name: " + name); 
		System.out.println("Student age: " + age);
	}
}
public class StudentProgram
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.display();
	}
}
