package ArrayQuetions;

public class ArrayClass 
{
   public static void main (String[] args)
   {
	   int a[]= {10,20,30,40,50};
	   
	   System.out.println("total no of lenth of array--> "+ a.length);
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		a[3] = 40;
//		a[4] = 50;

	   
	   // print array value
//	   for(int i=0; i<=a.length-1; i++)
//	   {
//			   System.out.println(a[i]);
//	   }
//	   
	   //reverse value of array
	   
	   for(int i=a.length-1;i>=0;i--)
	   {
		   System.out.println(a[i]);
	   }
   }
   
}
