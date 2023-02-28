package StringQuetions;

public class VowelsCount 
{
	public void lenght()
	{
		String a = "Manojkumar";
		System.out.println(a.length());
	}
	
	
	public static void main(String[] args)
	{
		
		String ab = "Manojkumar";
		
		ab=ab.toLowerCase();
		
		VowelsCount b=new VowelsCount();
		b.lenght();  // lenght method
		
		System.out.println(ab);
		
		int vCount=0,cCount=0;
		
		for(int i=0;i<ab.length();i++)
		{
			if(ab.charAt(i)== 'a' ||ab.charAt(i)=='e'||ab.charAt(i)=='i'||ab.charAt(i)=='o'||ab.charAt(i)=='u')
			{
				vCount++;
			}
			 else if(ab.charAt(i)>'a'&& ab.charAt(i)<'z')
			{
				cCount++;
			}

		}
		System.out.println("count of vowels-->"+ vCount);
		System.out.println("count of consonant-->"+ cCount);
		}
}
