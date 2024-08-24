	package Search;
	
	public class BinarySearch 
	{
		 void bsearch(int a[],int search) 
		 {
			 
			int li = 0;
			int n = a.length;
			int hi = n-1;
			int mi = (li+hi)/2;
			
			 
	while(li <= hi)
		{
			if(a[mi] == search)
				{
					System.out.println("Element is at " +mi+ " index position");
					break;
				}
			else if(a[mi]<search)
				{
					li = mi+1;
				}
			else
				{
					hi = mi-1;
				}
					mi = (li+hi)/2;
		}
		
	if(li>hi)
	{
		System.out.println("Element not found");

	}
	}
}