package Sorting;

public class BubbleSort {

	void bubblesorting(int[] a)
	{
		int n = a.length;
		System.out.println("Before Bubble Sorting");			

		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]);			
		}

		for(int i=0;i<n;i++)
			{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println();			

		System.out.println("After Bubble Sorting");			

		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]);			
		}
		System.out.println();			
	}
}