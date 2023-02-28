
public class Practice2 
{
	public static void main(String[] args)
	{
 			for(int i=1;i<=5;i++)
			{		System.out.print("Row"+i+"--> ");

				for(int j=1;j<=5;j++)
				{
					System.out.print("  P");
				}
				System.out.println();
			}
 			
 			//factorial que
		int multi=1;   //assume
   for(int i=1;i<=5;i++)
   {
	   multi= multi*i;
	    
   }
   System.out.println("factorial of 3-->"+multi);
   
   
  // How to Print ASCII Value in Java
	
//   char x = 'a';
//   System.out.println("character is->"+x);
//
////   x -> datType -> char --> convert -> int dataType
//   
//    int y = x;          //casting concept
//   
//   System.out.println("ASCII value of char is->"+y);
   
   
   //reverse ->
   //ASCII number -> ASCII char
   
   int x = 65;
   System.out.println("ASCII number->"+x);
   
   char y= (char)x;
   System.out.println("ASCII char is ->"+y);
   
   
   //casting related concepts
   //ASCII number to char
   //ASCII char to number


	}

}
