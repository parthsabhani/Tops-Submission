package com.io;

import java.io.FileWriter;

public class CreateAFile 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileWriter fw = new FileWriter("file_1.txt", true);
			String s = "This is first test file 1.";
			fw.write(s);
			fw.flush();
			fw.close();
			System.out.println("Data Written in file_1...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
