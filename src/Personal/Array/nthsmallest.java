package Personal.Array;

import java.util.Arrays;

public class nthsmallest {

	void nsmallest(int[] a) {
		Arrays.sort(a);
		
		int n = a.length;
		int smallest = a[0];
		int largest = a[n-1];
		
		System.out.println("smallest of array = " +smallest);
		System.out.println("largest of array = " +largest);
		
	}
	
	void nsmallestaftersorting(int[] a) {
		
		sortedArray sortt = new sortedArray();
		sortt.sort(a);
				
		int n = a.length;
		int smallest = a[0];
		int largest = a[n-1];
		
		System.out.println("smallest of array = " +smallest);
		System.out.println("largest of array = " +largest);

	}
	
}
