package com.io;

import java.io.File;

class FDemo
{
	File file;
	public FDemo()
	{
		file =  new File("f3.txt");
		try 
		{
			file.createNewFile();
			// String s = "new file root class demo.";
			// To write the data we have
			// FileWriter (Character) (Overwrite by default)
			// PrintWriter (Character) (can append)
			// BufferedWriter (Character) (can append)
			// FileOutputWriter (Byte) (Overwrite by default)
			// BufferedOutputStream (Byte) (can append)
			display();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void display()
	{
		System.out.println("is directory or not : " + file.isDirectory());
		System.out.println("is file or not : " + file.isFile());
		System.out.println("can read or not : " + file.canRead());
		System.out.println("can write or not : " + file.canWrite());
		System.out.println("can execute or not : " + file.canExecute());
		System.out.println("File Name : " + file.getName());
	}
}

public class FileDemo 
{
	public static void main(String[] args) 
	{
		new FDemo();
	}
}
