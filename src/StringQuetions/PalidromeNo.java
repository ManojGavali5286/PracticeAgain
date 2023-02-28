package StringQuetions;

public class PalidromeNo
{public static void main(String[] args) 
{
	int num=1517 , rev=0;
	int temp=num;
	while(num!=0)
	{
		rev= rev*10+num%10;
		num=num/10;
	}
	if(temp==rev)
	{
		System.out.println("palidrome no is-->"+temp);
	}
	else
	{
		System.out.println("not palidrme no-->"+temp);
	}
}

}
