
public class InsertionSort 
{
	public static void main(String[] args) 
	{
		int[] array = {1, 6, 2, 4, 5, 3};
		
		insertionSort(array);
		
		printArray(array);
	}
	
	public static void insertionSort(int[] array)
	{
		for(int i=1;i<array.length;i++) 
		{
			int e = array[i];
			int j = i-1;
			
			while(j >= 0 && array[j] > e)
			{
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = e;
		}
	}
	
	public static void printArray(int[] array)
	{
		for(int n : array)
		{
			System.out.print(n + " ");
		}
	}
}
