
public class CheckWholeString 
{
	public static void main(String[] args) 
	{
		String s = "I am #1 programmer.";

		int digits = 0;
		int vowels = 0;
		int spaces = 0;
		int specialCharacters = 0;
		int consonants = 0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			char c = s.toLowerCase().charAt(i);
			if(Character.isDigit(c))
			{
				digits++;
			}
			else if(Character.isLetter(c))
			{
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				{
					vowels++;
				}
				else
				{
					consonants++;
				}
			}
			else if(Character.isSpaceChar(c))
			{
				spaces++;
			}
			else 
			{
				specialCharacters++;
			}
		}
		
		System.out.println("Digits: " + digits);
		System.out.println("Digits: " + vowels);
		System.out.println("Digits: " + consonants);
		System.out.println("Digits: " + spaces);
		System.out.println("Digits: " + specialCharacters);
	}
}
