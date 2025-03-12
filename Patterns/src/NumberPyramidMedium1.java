
/*

     1
    121
   12321
  1234321
 123454321


*/
public class NumberPyramidMedium1 
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
				System.out.print(j);
			}
				for(int x=i-1; x>=1; x--)
				{
					System.out.print(x);	
				}
			System.out.println();
		}
	}
}
