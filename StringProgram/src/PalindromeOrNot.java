
public class PalindromeOrNot 
{
	public static void main(String[] args) 
	{
		String s = "abcabcCBACBA";
		String reverseString = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			reverseString += s.charAt(i);
		}
		
		if(reverseString.toLowerCase().equals(s.toLowerCase()))
		{
			System.out.println("String is Palindrome");
		}else
		{
			System.out.println("String is Not Palindrome ");
		}
	}
}
