package StringQuetions;

public class DuplicateCharInname
{
	public static void main(String[] args) 
	{
		String a="Welcome to java";
		
		for(int i=0;i<=a.length();i++)
		{
			for(int j=i+1; j<a.length(); j++)
			{
				if(a.charAt(i)==a.charAt(j))
				{
					System.out.println(a.charAt(j));
					//space is also consider as a char
				break;
				}
			}
		}
	}

}
