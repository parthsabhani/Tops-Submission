package com.packagesExercise2;

import com.packagesExercise.Person;

public class TestPersonInDifferentPackage 
{
	public static void main(String[] args) 
	{
		Person person = new Person("Krish Mathur", "Vastrapur", 20, "9865235262");
		
		person.name = "Parth Sabhani";
		person.printName();
		
//		person.printAddress(); // Error: default method is not accessible outside the package
//      person.printAge(); // Error: protected method is not accessible outside the package without inheritance
		
//		person.phone = "54656525555"; // Error: private field cannot be accessed
//		person.printPhone(); // Error: private method cannot be accessed
	}
}
