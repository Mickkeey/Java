package Personal.Array;

public class IntToArray {

	void int2Array(int n)
	{
		String s = String.valueOf(n);
		char[] strArr = s.toCharArray();
		n = strArr.length;
		System.out.println(s);
		System.out.println(n);


		for (int i=0;i<n;i++)
		{
			System.out.println("strArr = "+strArr[i]);
		}
	}
	
}
