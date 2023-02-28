package StringQuetions;

public class PalidromeString
{
	public static void main(String[] args) 
	{
		String mystring="anna";   //1
		
		StringBuffer buffer = new StringBuffer(mystring);
		
		buffer.reverse();
		
	  String data	=buffer.toString();  //2
	
		if(mystring.equals(data))
		{
			System.out.println("String is palidrome");
		}
		else
		{
			System.out.println("string is not palidrome");
		}
		
		
	}

}
