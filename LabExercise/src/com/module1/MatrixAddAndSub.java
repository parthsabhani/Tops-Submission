package com.module1;

import java.util.Arrays;

public class MatrixAddAndSub 
{
	public static void main(String[] args) 
	{
		// Matrix A
		int[][] a = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }; 

		// Matrix B
		int[][] b = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
		
		// Addition of Matrix
		int[][] add = matrixAddition(a, b);
		System.out.println("Addition : ");
		printArray(add);
		
		// Subtraction of Matrix
		int[][] sub = matrixSubtraction(a, b);
		System.out.println("Subtraction : ");
		printArray(sub);
	}
	
	public static void printArray(int[][] array)
	{
		for(int[] i : array )
		{			
			System.out.println(Arrays.toString(i));
		}
	}
	
	public static int[][] matrixAddition(int[][] a, int[][] b)
	{
		int[][] c = new int[a.length][];
		for(int i=0;i<a.length;i++)
		{
			c[i] = new int[a[i].length];
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
	
	public static int[][] matrixSubtraction(int[][] a, int[][] b)
	{
		int[][] c = new int[a.length][];
		for(int i=0;i<a.length;i++)
		{
			c[i] = new int[a[i].length];
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j] = a[i][j] - b[i][j];
			}
		}
		return c;
	}
}
