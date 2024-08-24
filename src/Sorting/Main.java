package Sorting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {7,8,3,1,2};
		BubbleSort bsort = new BubbleSort();
		bsort.bubblesorting(a);
		
		int[] b = {7,8,3,1,2};

		SelectionSort ssort = new SelectionSort();
		ssort.selectionsorting(b);
		
		int[] c = {7,8,3,1,2};

		InsertionSort isort = new InsertionSort();
		isort.insertionsorting(c);
	}

}
