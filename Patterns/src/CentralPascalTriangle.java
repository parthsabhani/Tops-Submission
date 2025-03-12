
/*
 
     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 


*/
public class CentralPascalTriangle 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				int result = fact(i-1) / (fact(j-1) * fact(i-j));
				
				System.out.print(result + " ");
			}
			System.out.println();
		}
	}	
	
	public static int fact(int n)
	{
		if(n < 2)
		{
			return 1;
		}
		
		return n*fact(n-1);
	}
}
