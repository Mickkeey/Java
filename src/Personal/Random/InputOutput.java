package Personal.Random;

import java.util.Arrays;

public class InputOutput {
	
//	input array { 0, 1, 1, 0, 0, 1, 1, 0, 0, 1 } output should be { 0,0,0,0,0,1,1,1,1,1};
	
	void arrangeIO(int[] a)
	{
		int n = a.length;

		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+ " ");
		}

		System.out.println();

		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}
	
	void sortIO(int ab[])
	{
		int n = ab.length;

		for(int i=0;i<n;i++)
			{
				System.out.print(ab[i]+ " ");
			}

		System.out.println();

		int countzero = 0;
	
		for(int i =0;i<n;i++)
			{
				if(ab[i]==0)
					countzero++;
			}
		
		for(int i=0;i<countzero;i++)
			{
				ab[i] = 0;
			}
		for(int i=countzero;i<n;i++)
			{
				ab[i] = 1;
			}
		for(int i =0;i<n;i++)
			{
				System.out.print(ab[i]+ " ");
			}
	}
}