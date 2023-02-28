package Abc.Ifelseladder;


//in this 1condition under 2condition 
public class NestedIfStatement 
//blood donetion eligiblity
//use wieght,age criteria
{

public static void main(String[] args) 
{
	int age=19;
	int weight=95;
	if(age>=18 && age<100) // in between 18 to 100 we use && operators*
	{
		if(weight>=45 && weight<100)
		{
			System.out.println("he is eligible ");
		}
		else
		{
			System.out.println("he can not eligible due to wight ");
		}
	}
	else
	{
		System.out.println("he can not eligible due to age");
	}
	
	
	
	
	
	
	
	
}
}
