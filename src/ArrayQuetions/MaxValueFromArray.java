package ArrayQuetions;

public class MaxValueFromArray
{
	public static void main(String[] args) 
	{
	int a[]= {10,11,12,13,50,14,16};
	
	int max=a[0];    //assume max=0
	
	for(int i=1;i<=a.length-1;i++)
	{
		if(a[i]>max)
		{
            max=a[i];
		}
	}
	System.out.println("maximum no is-->"+max);
    }

}
