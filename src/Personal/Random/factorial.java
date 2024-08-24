package Personal.Random;

import java.util.Scanner;

public class factorial {
	private Scanner s;

	void factorialnum()
	{
		double number;
		double fact = 1;
		int i;

		s = new Scanner(System.in);
		System.out.println("Enter the number whose factorial is to be done = ");
		number = s.nextDouble();

		for(i=1;i<=number;i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial is " +fact);
	}
	
	int recurssionfact(int no) 
	{
			if (no>=1) {
				return (no * recurssionfact(no-1));
			}
			return 1;
	}
}
