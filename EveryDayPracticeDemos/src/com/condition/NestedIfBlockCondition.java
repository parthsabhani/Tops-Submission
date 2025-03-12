package com.condition;

public class NestedIfBlockCondition 
{
	public static void main(String[] args) 
	{
		int n = 10;
		if(n > 5) // 1st condition
		{
			if(n > 10) // 2nd condition
			{
				System.out.println("Greatter than 10.");
			}
			else // false for 2nd condition
			{
				System.out.println("Greatter than 5.");
			}
		}
		else // false for 1st condition
		{
			System.out.println("Smaller than 5.");
		}
	}
}
