package ArrayQuetions;

public class SmallestElementArray 
{
	public static void main(String[] args) 
	{
	int a[]= {10,11,4,12,13,2,50};
	
	int min=a[0];    //assume min=0
	
	for(int i=a.length-1;i>=1;i--)
	{
		if(a[i]<min)
		{
            min=a[i];
		}
	}
	System.out.println("minimum no is-->"+min);
    }
	
}
