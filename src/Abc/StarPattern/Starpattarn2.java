package Abc.StarPattern;

public class Starpattarn2 
{
	public static void main(String[] args)
	{
	
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int h=1;h<=i;h++)
		{
			System.out.print("*");
		}
		System.out.println();
	
	}
	//reverse
	for(int i=4;i>=1;i--)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int h=1;h<=i;h++)
		{
			System.out.print("*");
		}
		System.out.println();
	
	}
	
	}
}
