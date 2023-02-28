package basicsOfJava;

public class Ifblood
{
       public static void main(String[] args)
       
       {
       int age=25;
       int weight=45;
       
       if(age>18)
       
       {
    	   System.out.println("check weight");
    	   
    	   if (weight>50)
    	   {
    		   System.out.println("u r eligible blood donate"); 
    		 
    	   }
         
    	  else
    	      	   	   
    	   {
    		   System.out.println("u r not eligible-due to weight");
    	   }
       }

     else
       {
    	   System.out.println("u r not eligible- due to age");
       }
              
       
}}