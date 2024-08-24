package Map;

import java.util.HashMap;
//import java.util.Map;

public class MapPrint {

	public static void main(String[] args) {

		
		HashMap<Integer, String> newentry = new HashMap<Integer, String>();
		
		newentry.put(101, "Mohit");
		newentry.put(102, "Sweta");
		
		System.out.println(newentry);
		
		
//		for(Map.Entry ab : newentry.entrySet())
//		{
//			System.out.println(ab.getKey());
//
//			System.out.println(ab.getValue());
//		}
	}

	
}
