package com.module1;

class Vehicle 
{
    void start() 
    {
        System.out.println("Vehicle is starting");
    }
}

class C extends Vehicle 
{
    @Override
    void start() 
    {
        System.out.println("Car is starting with an engine");
    }
}	

class Bike extends Vehicle 
{
    @Override
    void start() 
    {
        System.out.println("Bike is starting with a kick");
    }
}

public class RuntimePolymorphism 
{
	public static void main(String[] args) 
	{
		Vehicle v1 = new C();  
        Vehicle v2 = new Bike(); 
        
        v1.start();
        v2.start();
	}
}
