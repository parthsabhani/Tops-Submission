package com.exception;

import java.util.Scanner;

class NoBalanceException extends Exception 
{
	double amount;

	public NoBalanceException(double amount) 
	{
		this.amount = amount;
	}
}

class ATM 
{
	double balance;

	public void deposit(double amount) 
	{
		balance += amount;
		System.out.println(amount + "rs deposited..");
	}

	public void withdraw(double amount) throws NoBalanceException 
	{
		if (amount <= balance) 
		{
			balance -= amount;
			System.out.println(amount + "rs withdraw Successfully..");
		} 
		else 
		{
			double needs = amount - balance;
			throw new NoBalanceException(needs);
		}
	}
}

public class CustomExceptionDemo 
{
	public static void main(String[] args) 
	{
		ATM a = new ATM();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter amount to deposite : ");
		double amount = sc.nextDouble();
		a.deposit(amount);

		System.out.println("Enter amount for withdraw : ");
		amount = sc.nextDouble();
		try 
		{
			a.withdraw(amount);
		} 
		catch (NoBalanceException e) 
		{
			System.out.println("Please deposite " + e.amount + "rs more to withdraw " + amount);
		}
		sc.close();
	}
}
