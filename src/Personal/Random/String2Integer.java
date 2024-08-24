package Personal.Random;

public class String2Integer {

	int str2int(String str)
	{
		
		int len = str.length();
        int result = 0;
//        int startIndex = 0;
//        boolean isNegative = false;
//        
//        if (str.charAt(0) == '-') {
//            isNegative = true;
//            startIndex = 1;
//        }
        
	for (int i = 0; i < len; i++) 
		{
	        char ch = str.charAt(i);
	        if (ch < '0' || ch > '9') 
	        	{
	            throw new IllegalArgumentException("String contains non-digit characters");
	        	}
	    // Multiply the result by 10 and add the integer value of the current digit
//	        The character '0' has a Unicode value of 48.
//	        The character '1' has a Unicode value of 49.
//	        '1' - '0' = 49 - 48 = 1
	        result = result * 10 + (ch - '0');
    	}
    return result;
	}
	
	int simplestr2int(String str)
	{
		System.out.println(str+1);

		int num = Integer.parseInt(str);
		
		System.out.println(num+1);
		
		return num;
		
	}
}