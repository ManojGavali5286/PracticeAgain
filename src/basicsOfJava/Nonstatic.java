package basicsOfJava;

public class Nonstatic
{    
         {
	System.out.println("non static method");
         }
	public void method1()
	{
		int a=20;
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		Nonstatic b=new Nonstatic();
		b.method1();
		System.out.println();
	}
}
