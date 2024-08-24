package Personal.Random;

public class NumberExchange {
	void numberExcahngeWithoutTemp(int a,int b)
	{
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Function in another class a = " +a);
		System.out.println("Function in another class b = " +b);
	}

	
	void numberExcahngeWithoutTempUsingArrays(int a,int b)
	{
//		int A = (int) a;
//		int A[1] = b;
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Function in another class a = " +a);
		System.out.println("Function in another class b = " +b);
	}
	
	int interchangeUsingTemp(int a, int b)
	{
		int t;
		t = a;
		a = b;
		b = t;
		
		System.out.println("In Function a = " +a);
		System.out.println("In Function b = " +b);

		return b;
	}
}
