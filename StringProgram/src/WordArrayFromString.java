
public class WordArrayFromString 
{
	public static void main(String[] args) 
	{
		String s = "Hello Everyone, Good Morning!";
		String[] arr = new String[s.length()];
		String word = "";
		int index = 0;
		for(int i=0;i<s.length();i++)
		{
			if(!Character.isSpaceChar(s.charAt(i)))
			{
				word += s.charAt(i);
			}			
			else
			{
				arr[index] = word;
				word ="";
				index++;
			}
		}
		arr[index] = word;
		printArray(arr);
	}
	
	public static void printArray(String[] arr)
	{
		for(String s : arr)
		{
			if(s != null)
			{				
				System.out.print(s + " ");
			}
		}
	}
}
