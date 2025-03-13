package com.packagesExercise;

public class TestPerson 
{
	public static void main(String[] args) 
	{
		Person person = new Person("Kedar", "Science City", 25, "54689875235");

		person.name = "Krish Shah"; 
//		person.phone = "9856523014";// Error: private field
//		person.printPhone(); // Error: private method cannot be accessed

		person.printAddress(); // default : same package
		person.printAge(); // protected : same package
		person.printName(); // public
	}
}
