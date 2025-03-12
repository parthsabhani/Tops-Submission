package com.io;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamDemo 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileWriter fw = new FileWriter("f2.txt");
			String s ="Good at file handling.";
			fw.write(s);
			fw.flush();
			fw.close();
			System.out.println("Data written...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try 
		{
			FileReader fr1 = new FileReader("f2.txt");
			FileReader fr2 = new FileReader("f1.txt");
			int i;
			
			while((i = fr2.read()) != -1)
			{
				System.out.print((char)i);
			}	
			System.out.println();
			while((i = fr1.read()) != -1)
			{
				System.out.print((char)i);
			}
			fr1.close();
			fr2.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
