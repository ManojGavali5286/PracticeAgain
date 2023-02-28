package ArrayQuetions;



public class CopyOneArrayToAnotherArray 
{
	public static void main(String[] args)
	{
		int A[]= {10,20,30,40,55,2};
		int B[]= new int[A.length];
		System.out.println("length of A --> "+A.length);
		System.out.println("length of B --> "+B.length);
		
		for(int i=0;i<=A.length-1;i++)
		{
			System.out.print("  "+A[i]);
		}
		System.out.println();
		for(int i=0;i<=A.length-1;i++)
		{
			B[i]=A[i];
		}
		System.out.println("coping A[]toB[]");
		
		for(int i=0;i<=B.length-1;i++)
		{
			System.out.print("  "+B[i]);
		}
		
	} 
          
}
