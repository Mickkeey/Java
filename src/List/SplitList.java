package List;

import java.util.ArrayList;
import java.util.List;

public class SplitList {

	// Java Program to Split a List into Two Sublist
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("ad");
		list.add("bd");
		list.add("sd");
		list.add("fk");
		list.add("sjk");
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
		
		
		List<String> first = new ArrayList<String>();
		List<String> second = new ArrayList<String>();
		
		int size = list.size();
		
		System.out.println("Overall list = " +list);

		for (int i=0;i<size/2;i++)
		{
			first.add(list.get(i));
		}
		for (int j=size/2;j<size;j++)
		{
			second.add(list.get(j));
		} 

		System.out.println("first list = " +first);
		System.out.println("second list = " +second);

	}

}
