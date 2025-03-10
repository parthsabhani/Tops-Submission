package com.module1;

import java.util.Scanner;

public class MenuDrive 
{
	public static void main(String[] args) 
	{
		  System.out.println("Simple Menu");
          System.out.println("1. About us");
          System.out.println("2. Projects");
          System.out.println("3. Employees");
          System.out.println("4. Contact us");
          
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter your choice (1-5): ");
          int choice = sc.nextInt();
          
          switch(choice)
          {
          	case 1:
          		System.out.println("Hello and Welcome to programming world.");
          		break;
          	case 2:
          		System.out.println("Project 1: Hospital erp");
          		System.out.println("Project 2: Marking attendence system");
          		System.out.println("Project 3: Parking allotment");
          		break;
          	case 3:
          		System.out.println("CEO - Rakesh Ahuja");
          		System.out.println("CTO - Nirmal Mehta");
          		System.out.println("Prject Manager - Krish Patel");
          		break;
          	default:
          		System.out.println("Contact us - email@gmail.com");
          		break;
          }
          
          sc.close();
	}
}
