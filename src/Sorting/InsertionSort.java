package Sorting;

public class InsertionSort {
	
	void insertionsorting(int[] a)
	{
		int n = a.length;
		System.out.println("Before Insertion Sorting");			

		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]);			
		}
		
			for(int i=1;i<n;i++)
				{
				int current = a[i];
				int j = i-1;
					while(j>=0 && current<a[j])
					{
						a[j+1] = a[j];
						j--;
						
					}
					
				a[j+1] = current;
				}
			
		System.out.println();			

		System.out.println("After Insertion Sorting");			
			
			for(int i=0;i<n;i++)
			{
				System.out.print(a[i]);			
			}
			System.out.println();			

		}
}