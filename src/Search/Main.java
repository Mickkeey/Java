package Search;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {1,2,6,7,8,10, 13, 16};
		int search = 15;
		BinarySearch searchval = new BinarySearch();
		searchval.bsearch(a,search);
		
		
		int ab[] = {1, 7, 8, 13, 10, 5 , 6, 16, 11};
		int othervalue = 7;
		
		LinearSearch lsearch = new LinearSearch();
		lsearch.linearSearching(ab, othervalue);
		
		
		String sarr[] = {"mohit", "lohit","rakesh", "suresh", "ajay"};
		String stringitem = "deepak";
		String stringotheritem = "mohit";
		lsearch.linearSearchString(sarr, stringitem);
		lsearch.linearSearchString(sarr, stringotheritem);
		
		StringSort sorting = new StringSort();
		sorting.stringSorting(sarr);


	}

}
