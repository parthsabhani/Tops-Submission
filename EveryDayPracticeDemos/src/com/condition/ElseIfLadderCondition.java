package com.condition;

public class ElseIfLadderCondition 
{
	public static void main(String[] args) 
	{
		int n =10;
		if(n > 0)
		{
			System.out.println("Greatter than 0.");
		}
		else if(n > 10)
		{
			System.out.println("Greatter than 10.");
		}
		else if(n > 50)
		{
			System.out.println("Greatter than 50.");
		}
		else
		{
			System.out.println("Negative number or Zero.");
		}
	}
}
