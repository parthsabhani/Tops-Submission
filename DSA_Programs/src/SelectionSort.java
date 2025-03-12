
public class SelectionSort 
{
	public static void main(String[] args) 
	{
		int[] array = {1, 6, 2, 4, 5, 3};
		
		selectionSort(array);
		
		printArray(array);
	}
	
	public static void selectionSort(int[] array) 
	{
		for(int i=0;i<array.length-1;i++)
		{
			int smallest = i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j] < array[smallest])
				{
					smallest = j;
				}
			}
			int temp = array[i];
			array[i] = array[smallest];
			array[smallest] = temp;
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
