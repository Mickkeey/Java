package Personal.Random;

public class Prime {

	void primeNo(int no)
	{
		int count = 0;
			for(int j=2;j<no-1;j++)
			{
				if(no%j==0)
				{
					count=count+1;
				}
			}
		if(count==0)
		{
			System.out.println("Prime = " +no);
		}
		else
			System.out.println("Not a Prime Number = " +no);
	}
	
	
	void primeNowithin100()
	{
		
		for(int i=2;i<100;i++)
		{
			int count = 0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					count=count+1;
				}
			}
			if(count==1)
			{
				System.out.println("Prime = " +i);
			}
			else
				System.out.println("Not a Prime Number = " +i);
		}
		
	}
}
