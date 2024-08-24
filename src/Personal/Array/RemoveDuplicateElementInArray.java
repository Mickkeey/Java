package Personal.Array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementInArray {

	void removeduplicate(Integer arr[])
	{
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
        Object[] uniqueArray = set.toArray();
        System.out.println("New Integer Array without duplicate " +Arrays.toString(uniqueArray));
	}
	
	void printduplicate(int arr[])
	{
        Arrays.sort(arr);

        int j=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
            	arr[j++] = arr[i];
            }	
        }
        
        arr[j++] = arr[arr.length - 1];        
        int[] newarr = Arrays.copyOf(arr, j);
        System.out.print("New int array without duplicate " +Arrays.toString(newarr));
	}
}