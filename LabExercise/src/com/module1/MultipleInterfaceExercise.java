package com.module1;

interface Robot 
{
    void start(); 
}

interface Machine 
{
    void operate(); 
}


class BottleMakingMachinary implements Robot, Machine 
{    
    @Override
    public void start() 
    {
        System.out.println("Machine is starting...");
    }

    @Override
    public void operate() 
    {
        System.out.println("Machine is operating...");
    }
}


public class MultipleInterfaceExercise 
{
	public static void main(String[] args) 
	{
		BottleMakingMachinary bm = new BottleMakingMachinary();
		bm.start();
		bm.operate();
	}
}
