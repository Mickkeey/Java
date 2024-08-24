package Personal.Array;

import java.util.Arrays;

public class Merger2list 
{	
	void mergerTwoList(int a[],int b[])
	{
		int[] c = new int[a.length+b.length];
		int n = a.length;
		int m = b.length;
			for(int i=0;i<n;i++)
				{
					c[i] = a[i];
				}
			for(int i=0;i<m;i++)
				{
					c[i+n] = b[i];
				}
			Arrays.sort(c);	
			for(int i=0;i<n+m;i++)
				{
					System.out.print(c[i]+ ",");
				}
		}
}