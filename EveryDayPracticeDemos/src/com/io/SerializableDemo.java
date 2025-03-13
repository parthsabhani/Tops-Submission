package com.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo 
{
	public static void main(String[] args) 
	{
		SerializableDemo s = new SerializableDemo();
		s.setSerializableData();
	}

	public void setSerializableData()
	{
		Address address = new Address();
		address.setCountry("India");
		address.setState("Gujarat");
		address.setCity("Ahmedabad");
		
		try 
		{	
			FileOutputStream fos = new FileOutputStream("abc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(address);
			oos.flush();
			fos.flush();
			oos.close();
			fos.close();
			System.out.println("Data written...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
