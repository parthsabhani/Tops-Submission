package com.module1;

interface PaymentGateway 
{
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentGateway 
{
    @Override
    public void processPayment(double amount) 
    {
        System.out.println("Processing Credit Card payment of " + amount + "rs..");
    }
}

class GPayment implements PaymentGateway 
{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Gpay payment of " + amount + "rs..");
    }
}

public class PaymentGatewayExercise 
{
	public static void main(String[] args) 
	{
		 PaymentGateway ccp = new CreditCardPayment();
	     PaymentGateway gp = new GPayment();
	     
	     ccp.processPayment(150.00);
	     gp.processPayment(200.00);
	}
}
