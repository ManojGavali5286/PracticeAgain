package Abc.PracticebasicOfJava;

public class JavaOperators 
//Arithmatic oprators
//+ -->Addition  10+2=12
//- -->substraction  10-2=8
//* --> multiplication 10*2=20
/// -->division  10/2=5
//% --> modulud(remainder)  9%2=4 , remainder=1
//**********************************
// unary oprator
//++ -->increment   a++(consider a=10)---->11
//-- -->decrement   a--(consider a=10)---->9
{
    public static void main(String[] args)
{
   int a=100;
   int b=200;
   //addition
   int c= a+b;
   System.out.println(c);
   System.out.println(a+b);
   
   //subsrtaction
   int d = a-b;
   
   System.out.println(d);
   System.out.println(a-b);
   
   //division
   int e= b/a;
   System.out.println(b/a); //quitiant
   System.out.println(e);
   
   // multiplication
   
   int f=b*a;
   System.out.println(f);
   System.out.println(b*a);
   
  //modulus
   int n=15;
   int h=2;
   
   int m=n%h;
   System.out.println(m);
   System.out.println(n%h);
   System.out.println(15%2);
   
   //double used for decimal 
   double x=21.0;
   double y=5.0;
    
   double w = x/y;
   System.out.println(w); //4.2  quiotiant
   System.out.println(x/y);// 4.2
   
   double ax=x%y;
   System.out.println(ax); //remainder 1.0
   
   double z=x+y;
   System.out.println(z);//26.0
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}  
}
