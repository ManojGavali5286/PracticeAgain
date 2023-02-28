package StringQuetions;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String name="Manoj", revers=" ";
		
		char rev;//  or String rev=" "; //empty for (i=name.lenght-1;i=0;i--;)
		
		System.out.println(name);  //befor reverse
		
		for (int i=0; i<name.length();i++)//
		{
			rev=name.charAt(i);
			
			revers=rev+revers;
			
		}
		
		//or//
		
//		for(int i=name.length()-1;i>=0;i--)
//		{
//			rev= rev + name.charAt(i);
//			//System.out.println(rev);
//			
//			
//		}
		System.out.println(revers);
	}

}
