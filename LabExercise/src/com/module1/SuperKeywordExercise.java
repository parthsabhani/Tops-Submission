package com.module1;

class Person 
{
    String name;
    int age;
    
    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
        System.out.println("Person Constructor: Name - " + name + ", Age - " + age);
    }

    public void greet() 
    {
        System.out.println("Hello, I am " + name + " and I am " + age + " years old.");
    }

    public void displayInfo() 
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Stud extends Person 
{
    String school;
    String grade;

    public Stud(String name, int age, String school, String grade) 
    {
        super(name, age);
        this.school = school;
        this.grade = grade;
        System.out.println("Student Constructor: School - " + school + ", Grade - " + grade);
    }

    @Override
    public void greet() 
    {   
        super.greet(); 
        System.out.println("I study at " + school + " and my grade is " + grade + ".");
    }

    public void displayStudentInfo() 
    {
        super.displayInfo();
        System.out.println("School: " + school + ", Grade: " + grade);
    }
}

public class SuperKeywordExercise 
{
	public static void main(String[] args) 
	{
		Stud s1 = new Stud("Raju", 16, "Skum High School", "11th");
		
		s1.greet();
		s1.displayStudentInfo();
	}
}
