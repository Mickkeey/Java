package Personal.Random;

public class ReverseNo {
	
	int reversenum(int number)
	{
		int revnumb=0;
		int rem;		
	
		while (number!=0)
		{
		rem = number%10;
		revnumb  = revnumb*10+rem;
		number = number/10;
		}
		return revnumb;

	}
}