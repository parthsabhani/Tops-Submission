package com.module1;

public class TypeCasting 
{
	public static void main(String[] args) 
	{
        // Implicit
        int num1 = 100;
        double num2 = num1; 
        System.out.println("(int to double): " + num2);

        // Implicit 
        float num3 = 3.14f;
        double num4 = num3;
        System.out.println("(float to double): " + num4);

        // Explicit 
        double largeNumber = 123.45;
        int smallerNumber = (int) largeNumber;
        System.out.println("(double to int): " + smallerNumber);

        // Explicit 
        long largeLong = 100000L;
        int smallInt = (int) largeLong; 
        System.out.println("(long to int): " + smallInt);

        // Explicit 
        double bigDecimal = 99.99;
        int roundedValue = (int) bigDecimal; 
        System.out.println("(double to int) Rounded value: " + roundedValue);
    }
}
