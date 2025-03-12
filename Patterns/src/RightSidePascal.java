
/*

     1
    11
   121
  1331
 14641

*/

public class RightSidePascal 
{
	public static void main(String[] args) 
	{
		int op = 1;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			System.out.println(op);
			op *= 11;
		}
	} 
}
