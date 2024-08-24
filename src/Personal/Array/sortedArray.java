package Personal.Array;

public class sortedArray {

	void sort(int a[])
	{
		int n = a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Sorted Array = " +a[i]);
		}
	}
}
