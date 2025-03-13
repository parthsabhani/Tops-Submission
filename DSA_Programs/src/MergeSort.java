
public class MergeSort 
{
	public static void main(String[] args) 
	{
		int[] array = {1,5,4,3,6,2,4};
		
		mergeSort(array, 0, array.length-1);
		
		printArray(array);
	}
	
	public static void printArray(int[] arr)
	{
		for(int i : arr)
		{
			System.out.print(i + " ");
		}
	}
	
	public static void mergeSort(int[] a, int l, int r)
	{
		if(l < r)
		{
			int m = l + (r-l)/2;
			
			mergeSort(a, l, m);
			mergeSort(a, m+1, r);
			
			merge(a, l, m, r);
		}
	}
	
	public static void merge(int[] a, int l ,int m, int r)
	{
		int n1 = m-l+1;
		int n2 = r-m;
		
		int[] left = new int[n1];
		int[] right= new int[n1];
		
		for(int i=0;i<n1;i++)
		{
			left[i] = a[l+i];
		}
		for(int j=0;j<n2;j++)
		{
			right[j] = a[m+1+j];
		}
		
		
		int i=0,j=0;
		int k=l;
		
		while( i<n1 && j<n2)
		{
			if(left[i] < right[j])
			{
				a[k] = left[i];
				i++;
			}
			else
			{
				a[k] = right[j];
				j++;
			}
			k++;
		}
		
		
		while(i< n1)
		{
			a[k] = left[i];
			i++;
			k++;
		}
		while(j< n2)
		{
			a[k] = right[j];
			j++;
			k++;
		}
	}
}
