package ArrayQuetions;

public class OddEvenElement 
{
	public static void main(String[] args) 
	{
		int a[]= {10,11,12,13,14,15,16,63,52};
		{
			System.out.println("length of array-->"+a.length);
		}
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even no -->"+a[i]);
			}
			else
			{
				System.out.println("odd no -->"+a[i]);
			}
		}
				
		
	}

}
