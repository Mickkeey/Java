package Personal;

import java.util.Scanner;

public class InputUser {
	private static Scanner s;

	public static void main(String args[])
	{
		s = new Scanner(System.in);
		System.out.println("Enter your name = ");
		String name = s.next();
		System.out.println("Enter your age = ");
		int age = s.nextInt();
		System.out.println("Enter your gender = ");
		char gender = s.next().charAt(0);
		System.out.println("Enter your phone number = ");
		Long phno = s.nextLong();
		
		System.out.println("Print the details of users");
		
		System.out.println("Name = " +name);
		System.out.println("Age = " +age);
		System.out.println("Gender = " +gender);
		System.out.println("Phone number = " +phno);
	}
	

}
