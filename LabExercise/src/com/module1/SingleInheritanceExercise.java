package com.module1;


class Animal
{
    String name;
    int age;

    public Animal(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    
    public void eat() 
    {
        System.out.println(name + " is eating.");
    }
    
    public void sound() 
    {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal 
{
    String breed;

    public Dog(String name, int age, String breed) 
    {
        super(name, age);  
        this.breed = breed;
    }

    @Override
    public void sound() 
    {
        System.out.println(name + " barks.");
    }

    public void displayDetails() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
    }
}

public class SingleInheritanceExercise 
{
	public static void main(String[] args) 
	{
		Dog dog = new Dog("Buddy", 5, "Golden Retriever");
		dog.displayDetails();
		dog.eat();  
        dog.sound();
	}
}
