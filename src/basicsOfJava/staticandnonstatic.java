package basicsOfJava;



public class staticandnonstatic
{
       void method1()
      {
    	 int a=6;
         int b=15;
    	 System.out.println(a+b);
    	 
      }
     public static void main(String[] args)
     {		 		 
    	   
    		int c=15;
    		int d=17;
    	 staticandnonstatic x= new staticandnonstatic();
   	    
   	     x.method1();  //this for non static 
       
         System.out.println(d-c);  //this for static
      } 	
}
    		 

