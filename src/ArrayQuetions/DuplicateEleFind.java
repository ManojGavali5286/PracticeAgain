package ArrayQuetions;

public class DuplicateEleFind 
{
	public static void main(String[] args) 
	{
		int a[]= {10,15,4,10,5,4,99};
		System.out.print("duplicates-->");
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print("  "+a[j]);
				}
			}
		} 
			
	}

}
