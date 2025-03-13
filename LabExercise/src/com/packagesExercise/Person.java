package com.packagesExercise;

public class Person 
{
    public String name;
    String address;
    protected int age;
    private String phone;

    public Person(String name, String address, int age, String phone) 
    {
    	this.name = name;
        this.address = address;
        this.age = age;
        this.phone = phone;
    }

    // Public
    public void printName() 
    {
        System.out.println("Name: " + name);
    }

    // Default
    void printAddress() 
    {
        System.out.println("Address: " + address);
    }

    // Protected
    protected void printAge() 
    {
        System.out.println("Age: " + age);
    }

    // Private
    private void printPhone() 
    {
        System.out.println("Phone: " + phone);
    }
}
