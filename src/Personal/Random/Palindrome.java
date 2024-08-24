package Personal.Random;

public class Palindrome {
	
	void palindromenumber(int number)
	{
		int temp = number;
		
		int revnumb=0;
		int rem;		
	
		while (number!=0)
		{
		rem = number%10;
		revnumb  = revnumb*10+rem;
		number = number/10;
		}
	
	
	if (temp == revnumb)
	{
		System.out.print("Number is Palindrome " +temp);
	}
	else
		System.out.print("Number is Not Palindrome " +temp);
	}
}