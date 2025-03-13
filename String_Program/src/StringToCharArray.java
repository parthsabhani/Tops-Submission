
public class StringToCharArray 
{
	public static void main(String[] args) 
	{
		String s ="Hello tops";
		
		char[] cArr = new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			cArr[i] = s.charAt(i);
		}
		printArray(cArr);
	}
	
	public static void printArray(char[] arr)
	{
		for(char c : arr) 
		{
			System.out.print(c + ", ");
		}
	}
}
