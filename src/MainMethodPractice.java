
public class MainMethodPractice 
{ 
	public static void maxi() 
	{
		System.out.println("abcd"); //it not printed
		
	}
	public static void main(String[] args)  // main method body we have call all the methods in main body
	{
		
		maxi();   // call it by class name in main method and run
		System.out.println("manoj");
		method1();
	}
// we cant make another main method in class
//    public static void main1 (String[] args) 
//{
//    	main1(args);
//	System.out.println("dhanesh");
//}
public static void method1()
{
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
}
	}
