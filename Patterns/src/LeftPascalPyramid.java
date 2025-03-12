
/*

1
11
121
1331
14641

*/
public class LeftPascalPyramid 
{
	public static void main(String[] args) 
	{
		int op = 1;
		for(int i=1;i<=5;i++)
		{
			System.out.println(op);
			op = op*11;
		}
	}
}
