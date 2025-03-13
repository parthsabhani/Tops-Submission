
public class QuickSort 
{
	public static void main(String[] args) 
	{
		int[] array = {1,5,4,3,6,2,4};
		
		quickSort(array, 0, array.length-1);
		
		printArray(array);
	}
	
	public static void printArray(int[] arr)
	{
		for(int i : arr)
		{
			System.out.print(i + " ");
		}
	}
	
	public static void quickSort(int[] a, int s, int e)
	{
		if(s < e)
		{			
			int pi = partition(a, s, e);
			
			quickSort(a, s, pi-1);
			quickSort(a, pi+1, e);
		}	
	}
	
	public static int partition(int[] a, int s, int e)
	{
		int pivot = a[e];
		int i=s-1;
		try 
		{
			
			for(int j=s;j<e;j++)
			{
				if(a[j] < pivot)
				{
					i++;
					swap(a, i, j);
				}
			}
			
			swap(a, i+1, e);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return i+1;			
	}
	
	public static void swap(int[] a, int i, int j) 
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
