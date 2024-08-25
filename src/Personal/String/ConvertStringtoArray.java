package Personal.String;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


//Convert Set of String to Array of String in Java

public class ConvertStringtoArray {
	
	public static String[] convertingString(Set<String> setOfString)
	{
		String[] arrayofString = new String[setOfString.size()];	
		int i = 0;
		
	for(String str : setOfString)
		arrayofString[i++] = str;
		return arrayofString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> setOfString = new HashSet<>(Arrays.asList("Geeks", "ForGeeks", "A Computer Portal"));
		
		System.out.println("Set of String = " +setOfString);
		
		String[] convertedString = convertingString(setOfString);
		
		System.out.println("Array of String = " +Arrays.toString(convertedString));

	}

}
