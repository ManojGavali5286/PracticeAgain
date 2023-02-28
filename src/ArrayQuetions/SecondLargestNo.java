package ArrayQuetions;


public class SecondLargestNo 
{
	public static void main(String[] args) 
	{
		int a[]= {10 ,20,30,40,50,60,70};
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j]);
				{	
			  int second=a[i];
			  a[i]=a[j];
			  a[j]=second;
			  
				}	
			} 
		}
		System.out.println(a[1]);
	}

}
