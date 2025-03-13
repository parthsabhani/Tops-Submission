package com.packagesExercise2;

public class TestEmployee 
{
	public static void main(String[] args) 
	{
		 Employee employee = new Employee("Smith Patel", "Bhopal", 40, "7548654255");
		 
		 employee.printName(); // Accessible because it's public
		 employee.displayDetails(); // Accessing protected method through subclass
	}
}
