package Personal.String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String();
		s = "mohitsharma";	
        CharCounter c = new CharCounter();
        c.countCharInString(s);			
	}
		
	
	public static class CharCounter{
		
		void countCharInString(String s)
		{
			
		int size = s.length();
		for (int i=0;i<size;i++)
			{
			int count = 0;
					for (int j=0;j<size;j++)
						{
								if(s.charAt(i)==s.charAt(j))
									{
										count = count + 1;
									}
						}
					System.out.println("character at " +s.charAt(i)+ " repeats " +count+ " times");
			}
		}
	}
	
}