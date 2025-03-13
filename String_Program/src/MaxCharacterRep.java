
public class MaxCharacterRep 
{
	public static void main(String[] args) 
	{
		String s = "Hello, Programming.";

		int previousCount = 0;
		char c = ' ';
		for (int i = 0; i < s.length(); i++) 
		{
			if (!Character.isSpaceChar(s.charAt(i))) 
			{
				int count = 1;
				for (int j = i + 1; j < s.length(); j++) 
				{
					if (s.toLowerCase().charAt(i) == s.toLowerCase().charAt(j)) 
					{
						count++;
					}
				}
				if (count >= previousCount) 
				{
					previousCount = count;
					c = s.charAt(i);
				}
			}
		}

		System.out.println(c + " : " + previousCount);
	}
}
