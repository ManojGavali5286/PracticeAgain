package ArrayQuetions;

public class ArrayPractice 
{
	public static void main(String[] args) 
	{
	int A[]= {25,10,25,30,40,50,21,34,50,53,10};
	  System.out.println("duplicate no-->");
	  
	for(int i=0;i<A.length;i++)
	{
		for (int j=i+1;j<A.length;j++)
		{
			if(A[i]==A[j])
			{
				System.out.print("  "+A[j]);
			}
		}
	}
	} 
}
