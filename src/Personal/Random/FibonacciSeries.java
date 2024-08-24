package Personal.Random;

public class FibonacciSeries {
	int sum;
	
	void FibSeries(int n)
	{
		int first = 1;
		int second = 1;
		System.out.println("Fibonacci Series = " +first);
		System.out.println("Fibonacci Series = " +second);

	for (int i=3;i<n;i++)
		{
			int third = first+second;
		
			System.out.println("Fibonacci Series = " +third);
				first = second;
				second = third;
		}
	
	}
	
	void FibSeriesRecurrsion(int n)
	{
		int first = 1;
		int second = 1;
			System.out.println("Fibonacci Series = " +first);
			System.out.println("Fibonacci Series = " +second);
			recurrsion(n, first, second);
	}

void recurrsion(int n, int first, int second)
{
	if (n>=1)
	{
		int third = first+second;		
		System.out.println("Fibonacci Series = " +third);
		int newfirst = second;
		int newsecond = third;
		recurrsion(n-1, newfirst, newsecond);
	}
}
}