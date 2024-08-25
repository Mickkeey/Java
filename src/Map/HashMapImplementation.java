package Map;

import java.util.HashMap;

public class HashMapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1,"a");
		hm.put(2,"e");
		hm.put(4,"jdsk");
		
		System.out.println("Before adding null and duplicate = " +hm);

		hm.put(1,"a");
		hm.put(2,"u");
		hm.put(3,"jdsk");
		
		System.out.println("After adding duplicate = " +hm);

		hm.put(null, null);
		
		System.out.println("After adding null = " +hm);

	}

}
