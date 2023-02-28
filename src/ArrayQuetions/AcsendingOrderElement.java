package ArrayQuetions;

public class AcsendingOrderElement 
{
	public static void main(String[] args)
	{ 
		
		int a[]= {10,20,50,30,60,90,70,40};
		{
			System.out.println("length--->"+a.length);
		}
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					int ascd =a[i];
					a[i]=a[j];
					a[j]=ascd;
				}
			}
		}
		System.out.println("no pn ascending order are-->");
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print( " "+a[i]);
		}
	}

}
