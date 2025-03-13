package com.packagesExercise2;

import com.packagesExercise.Person;

public class Employee extends Person 
{
	public Employee(String name, String address, int age, String phone) 
	{
		super(name, address, age, phone);
	}

	public void displayDetails() 
	{
		printAge(); // Accessible because it's protected and Employee is a subclass
	}
}
