package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
	
	System.out.println("list with duplicates = " +list);
	
	list = removeDuplicates(list);
	
	System.out.println("list without duplicates = " +list);

	}
	
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) 
    {
	Set<T> set = new LinkedHashSet<>();
	
	set.addAll(list);
	
	list.clear();
	
	list.addAll(set);
	
	return list;

	}
}
