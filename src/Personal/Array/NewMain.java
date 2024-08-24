package Personal.Array;

import java.util.ArrayList;

public class NewMain {

	public static void main(String[] args) {

		
		ArrayList<Integer> a =new ArrayList<Integer>();
		a.add(10);
		a.add(93);
		a.add(1);
		
		int[] a11 = new int[6];
		a11[0] = 50;
		a11[1] = 10;
		a11[2] = 30;
		a11[3] = 20;
		a11[4] = 90;
		a11[5] = 80;
		
		ArrayFunction secondhighest = new ArrayFunction();
		secondhighest.secondHighest(a11);		

		int[] an = {1,2,3};

		ArrayFunction a1 = new ArrayFunction();
		a1.secondHighest(an);

		
		int[] ass = {1,2,34,58,5,7,3,2,2,1,58};
		int b = 92772;
		
		IntToArray I = new IntToArray();
		I.int2Array(b);
	
		Integer array[] = {1,2,34,58,5,7,3,2,2,1,58};
		int arr[] = {1,2,34,58,5,7,3,2,2,1,58};
		RemoveDuplicateElementInArray dup = new RemoveDuplicateElementInArray();
		dup.removeduplicate(array);
		dup.printduplicate(arr);
		
		int arrb[] = {1,2,89,67,12,4,6};

		Merger2list merge = new Merger2list();
		merge.mergerTwoList(arr,arrb);
		
		nthsmallest  smallest = new nthsmallest();
		smallest.nsmallest(arrb);
		smallest.nsmallestaftersorting(ass);
	}
}
