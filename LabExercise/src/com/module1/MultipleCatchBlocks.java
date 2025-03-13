package com.module1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MultipleCatchBlocks 
{
	public static void main(String[] args) 
	{
		try 
		{			
			FileOutputStream fos = new FileOutputStream("test.txt"); // FileNotFound
			String s = "This is multiple catch block test...";
			byte[] b = s.getBytes();
			fos.write(b); // IOException
			fos.flush(); // IOException
			fos.close(); // IOException
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found Exception");
		}
		catch(IOException e)
		{
			System.out.println("IO Exception");
		}
	}
}
