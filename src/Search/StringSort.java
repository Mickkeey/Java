package Search;

import java.util.Arrays;

public class StringSort {
	void stringSorting(String[] ab)
	{
		int n = ab.length;
		Arrays.sort(ab);

		for(int i=0;i<n;i++)
		{			
			System.out.print(ab[i]+ " ");
		}
	}

}
