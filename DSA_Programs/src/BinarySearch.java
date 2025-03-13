import java.util.Arrays;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int[] array = {2,1,3,4,6,1};
		int target = 1;
		
		Arrays.sort(array);
		
		int index = binarySearch(array, 0, array.length-1, target);
		
		System.out.println("Taget is at index no : " + index);
	}
	
	public static int binarySearch(int[] a, int s, int e, int t)
	{
		int m = s + (e-s)/2;
		if(a[m] == t)
		{
			return m;
		}
		else if(t > a[m])
		{
			return binarySearch(a, m+1, e, t);
		}
		else if(t < a[m])
		{
			return binarySearch(a, s, m-1, t);
		}
		
		return -1;
	}
}
