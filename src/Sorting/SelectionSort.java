package Sorting;

public class SelectionSort {
	
	void selectionsorting(int[] a)
	{
		int n = a.length;
		System.out.println("Before Selection Sorting");			

		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]);			
		}
	
		{
			for(int i=0;i<n-1;i++)
				{
				int smallest = i;
				for(int j=i+1;j<n;j++)
				{
					if(a[smallest]>a[j])
					{
						smallest = j;
					}
				}
						int temp = a[smallest];
						a[smallest] = a[i];
						a[i] = temp;
					}
				}
		System.out.println();			

		System.out.println("After Selection Sorting");			
			
			for(int i=0;i<n;i++)
			{
				System.out.print(a[i]);			
			}
			System.out.println();			

		}
}
