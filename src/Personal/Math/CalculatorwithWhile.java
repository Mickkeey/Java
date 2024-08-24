package Personal.Math;

import java.util.Scanner;

public class CalculatorwithWhile {

	private static Scanner s;

	public static void main(String[] args) {

		String yourinput;
		do {
			s = new Scanner(System.in);
			System.out.println("Enter 1st number = ");
			int Number1 = s.nextInt();
			System.out.println("Enter 2nd number = ");
			int Number2 = s.nextInt();
			System.out.println("Please Enter what operation you want to do : Add + , Subtract - , Multiply * , Divide / ");
			char symbol = s.next().charAt(0);
			int Addition, Subtraction, Multiplication, Division;
			
			switch(symbol)
			{
				case '+': 	Addition = Number1 + Number2;
						  	System.out.println("Addition is = " +Addition);
						  	break;
							
				case '-': 	Subtraction = Number1 - Number2;
				  			System.out.println("Subtraction is = " +Subtraction);
				  			break;
				
				case '*': 	Multiplication = Number1 * Number2;
				  			System.out.println("Multiplication is = " +Multiplication);
				  			break;
				
				case '/': 	Division = Number1 / Number2;
				  			System.out.println("Division is = " +Division);
				  			break;
				  
				default : 	System.out.println("Invalid Input");  
				  			break;

			}
			
  			System.out.println("Enter users choice to continue : YES(Y) or NO (N) = ");
			yourinput = s.next();

		}while(yourinput.equals("y") || yourinput.equals("Y"));
	}
}