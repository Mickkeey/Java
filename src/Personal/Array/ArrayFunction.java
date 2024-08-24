package Personal.Array;

public class ArrayFunction {
	
	
	void secondHighest(int[] a)
	{
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		
		int n = a.length;
		System.out.println(n);

		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[j]>a[i]) {
					
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}	
			}
		}
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		
		System.out.println("Highest Number in the list is = " +a[1]+ " :)");		
	}
}
