package Set;

import java.util.HashSet;

public class HashSetImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();
		hs.add("a");
		hs.add("e");
		hs.add("jdsk");
		
		System.out.println("Before adding null and duplicate = " +hs);

		hs.add("a");
		hs.add("e");
		
		System.out.println("After adding duplicate = " +hs);

		hs.add(null);
		hs.add(null);
		
		System.out.println("After adding null = " +hs);

		// Checl HashMapImplementation also to understand the difference
	}
}
