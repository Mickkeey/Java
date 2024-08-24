package Search;

import java.util.Arrays;

public class LinearSearch {

	void linearSearching(int[] ab, int value)
	{
		int n = ab.length;
		int temp = 0;
		for(int i=0;i<n;i++)
		{
			if(ab[i]==value)
			{
				System.out.println(value+ " is present in array at " +i+ " index");
				temp = temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("Item is not present in array");
		}
	}
	
	
	void linearSearchString(String[] ab, String value)
	{
		int n = ab.length;
		int temp = 0;
		Arrays.sort(ab);

		for(int i=0;i<n;i++)
		{		
			if(ab[i].equals(value))
			{
				System.out.println(value+ " is present in array at " +i+ " index");
				temp = temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("Item is not present in array");
		}
	}
}
