package Practice;



public class MessageProg 
{
public static void main(String[] args)
{
	char z = '@';
	System.out.println(z);
	
	char h = '9';  //99 not possible  only 0-9 can write as char 
	System.out.println(h);      //character
  
	int a=120;
	{
		System.out.println(a+100);
	}
	
	boolean c = !true;   //! use opposite result
	{
		System.out.println(c);
	}
	int d=10;
	int e=12;
	{
		System.out.println(d+e+10);  // or (10+12+10)
	}
	e++;
	{
		System.out.println(e);
	}
	++e;
	{
		System.out.println(e);	
	}
//	for(;;)  // No condition --> it gives infinity output
//	{
//		System.out.println("hi");  // it run infinite
//	}
	//do-while prog
	{
  int i=1;
  
  do
  {
	  System.out.println("hi");i++;
  }
while(i<=0); // even condition is false 1 time cod will be printed
  }
	
	//
	{
		for(int i=1;i<=5;i++)
		{System.out.print("society"+i+"-->");
			for(int j=1;j<=5;j++)
			{
				System.out.print("flat"+j+"  ");
			}
			System.out.println();
		}
	}


}
}
