package List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Join2ArrayList {


// Join two ArrayLists in Java
//	Join 2 Set List will remove the duplicate and arrange them in ascending order

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> list1 = new ArrayList<>();
		
		ArrayList <Integer> list2 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(7);
		
		list2.add(4);
		list2.add(3);
		list2.add(5);
		list2.add(6);

		list1.addAll(list2);
		System.out.println("with inbuilt function and list having duplicate = " +list1);
		
		
		int len1 = list1.size();
		int len2 = list2.size();
		ArrayList <Integer> list3 = new ArrayList<>();
		for (int j=0;j<len1;j++)
			{
				list3.add(list1.get(j));
			}
		for (int i=len1;i<len2;i++)
		{
			list3.add(list2.get(i));
		}

		System.out.println("without Inbuilt funcation = " +list3);
		
		Set <Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(7);
		
		Set <Integer> set2 = new HashSet<Integer>();
		set2.add(4);
		set2.add(3);
		set2.add(5);
		set2.add(6);
		
		
		set1.addAll(set2);
		
		System.out.println("with inbuilt function and set not having duplicate = " +set1);
	}

}
