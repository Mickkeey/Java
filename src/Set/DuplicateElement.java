package Set;

import java.util.HashSet;

public class DuplicateElement {

	void duplicateElementList(int[] a)
	{
		int temp = -1;
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=a.length-1;i>=0;i--)
		{
			if(hs.contains(a[i]))
			{
				temp = i;
			}
			else
			{
				hs.add(a[i]);
			}
		}
		
		if(temp!=-1)
		{
			System.out.println("First Duplicate Element contains at " +temp+ " postion which is " +a[temp]);
		}
		else
		{
			System.out.println("First duplicate element not found");

		}
			}
}
