package com.io;

import java.io.FileInputStream;

public class ReadTheFileAndPrint 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fis = new FileInputStream("file_1.txt");
			int i;
			while((i = fis.read()) != -1)
			{
				System.out.print((char)i);
			}
			fis.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
