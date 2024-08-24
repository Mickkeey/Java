package Personal.Random;

import java.util.Scanner;

public class LeapYear {
	private Scanner s;

	void leapYear()
	{		
		int year = 0;

		s = new Scanner(System.in);
		System.out.println("Enter the year = ");
		year = s.nextInt();
				
		if((year%400==0) || (year%4==0 && year%100!=0))
		{
			System.out.println("Given year is leap year which is " +year);
		}
		else
			System.out.println("Given year is not a leap year which is " +year);
		}
	
}
