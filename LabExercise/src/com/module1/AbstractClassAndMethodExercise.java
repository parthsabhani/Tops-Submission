package com.module1;

abstract class Shape 
{ 
    abstract void area();
}	

class Circle extends Shape 
{
    double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    @Override
    void area() 
    {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}

public class AbstractClassAndMethodExercise 
{
	public static void main(String[] args) 
	{
		  Circle circle = new Circle(5.0);
		  circle.area();
	}
}
