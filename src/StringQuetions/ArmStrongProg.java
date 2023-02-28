package StringQuetions;

public class ArmStrongProg 
{
	///check wrong prog
	public static void main(String[] args) 
{
	int a=153;
	int temp=a, rev=0, ld;
	while(temp>0)
	{
		ld=temp%10;
		rev=rev+(ld*ld*ld);
		temp=temp/10;
	}
	if(rev==temp)
	{
		 System.out.println("armstrong no");
	}
	else
	{
		System.out.println("not armstrong no");
	}
}

}
