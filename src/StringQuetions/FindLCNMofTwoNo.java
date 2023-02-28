package StringQuetions;

public class FindLCNMofTwoNo 
{
	public static void main(String[] args) 
	{
	int num1=3, num2=4;
	int lcm=0, x=1;
	
	while(x<=(num1*num2))
	{
	if(x%num1==0 && x%num2==0)
	{
	lcm=x;
	break;
	}
	x++;
	}
	System.out.println("LCM of two numbers: " + lcm);
	}
}

