package StringQuetions;

public class FindGCDOftwoNo 
{
	public static void main(String[] args) 
	{
		int a=3, b=6;
		int g=0;
		for(int i=1; i<=a; i++)
		{
		if(a%i==0 && b%i==0)
		g=i;
		}
		System.out.println("GCD is: "+ g);
		
		
		//Logic2
//		public static void main(String[] args) 
//		{
//		int a=60, b=50;
//		while(a%b!=0)
//		{
//		int r= a%b;
//		a=b;
//		b=r;
//		}
//		System.out.println("GCD is: "+ b);
//		}
		
	}

}
