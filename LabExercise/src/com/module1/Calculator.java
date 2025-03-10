package com.module1;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) 
	{	
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		double num1 = scanner.nextDouble();
		System.out.println("Enter the second number: ");
		double num2 = scanner.nextDouble();

		System.out.println("\nChoose an operation:");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Modulus");

		int choice = scanner.nextInt();

		switch (choice) 
		{
		case 1: // Add
			System.out.println("Result Addition: " + (num1 + num2));
			break;
		case 2: // Subtract
			System.out.println("Result Subtraction: " + (num1 - num2));
			break;
		case 3: // Multiply
			System.out.println("Result Multiplication: " + (num1 * num2));
			break;
		case 4: // Divide
			if (num2 != 0) {
				System.out.println("Result Division: " + (num1 / num2));
			} else {
				System.out.println("Division by zero is not allowed.");
			}
			break;
		case 5: // Modulus
			System.out.println("Result Modulus: " + (num1 % num2));
			break;
		default:
			System.out.println("Invalid operation.");
			break;
		}
			scanner.close();
	}
}
