package com.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializableDemo 
{
	public static void main(String[] args) 
	{
		DeserializableDemo d = new DeserializableDemo();
		Address address = d.getSerializeData();
		System.out.println(address);
	}
	
	public Address getSerializeData()
	{
		Address address =null;
		try 
		{
			FileInputStream fis = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			address = (Address) ois.readObject();
			ois.close();
			fis.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return address;
	}
}
