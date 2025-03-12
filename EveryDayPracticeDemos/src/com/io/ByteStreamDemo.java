package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamDemo 
{
	public static void main(String[] args) 
	{
		try
		{			
			FileOutputStream fos = new FileOutputStream("f1.txt", true);
			String s="Hello I am a Good Programer";
			byte[] b = s.getBytes();
			
			fos.write(b);
			fos.flush();
			fos.close();
			System.out.println("Data Written...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		try 
		{
			FileInputStream fis = new FileInputStream("f1.txt");
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
