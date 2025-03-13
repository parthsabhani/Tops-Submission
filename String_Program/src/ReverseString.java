
public class ReverseString 
{
	public static void main(String[] args) 
	{
		String s = "Hello World";
		String reverseString = "";
		
		for(int i=s.length()-1; i>=0;i--)
		{
			reverseString += s.charAt(i);  
		}
		
		System.out.println("Original String: " + s);
		System.out.println("Reversed String: " + reverseString);
	}
}
