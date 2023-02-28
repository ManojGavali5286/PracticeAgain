package stringPackage;

public class ChildClassString extends StringSuperKeyWord 
{
  String name="child";
  int a= 200;
  
  public void printmethod()
  {
	   
	  //parent class
	  System.out.println(super.name);
	  System.out.println(super.a);
//	  
	  //child class
	  System.out.println(name);
	  System.out.println(a);
  }
  public static void main(String[] args)
  {
	   
	 ChildClassString x=new ChildClassString();
	   x.printmethod();
  }
  
}
