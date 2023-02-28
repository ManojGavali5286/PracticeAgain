package Abc;

public class IfIfelseladder
{
public static void main(String[] args)
{
	int a=50;
	int b=70;
if(a<=b)  // if a>b and statement is false then it wont show result 
	System.out.println("right");
// *********************************************************8 
//positive no. & negative no. if-else

int number= 165;

if(number<=0)
System.out.println(number+"    number is negative");
else
{
System.out.println(number+"    number is positive");	
}

System.out.println("end of programm");
//*******************************************************
// if-else if ladder
//programm for check number is positivr, negative or zero
//for used 3 or more conditions
int g=-4;
if(g>0)
{
	System.out.println(g+"  no. is postive");
}
else if(g<0)
{
	System.out.println(g+"  no. is negative");
}
else
{
	System.out.println(g+"  no. is zero");
}
//*************************************************
// ex.2 grade
 int marks=115;
 if(marks <= 100 && marks>=91)
 {
	 System.out.println("A grade");
 }
 else if(marks<=90 && marks>=81)
 {
	 System.out.println("B grade");
 }

 else if(marks<=80&&marks>=71)
 {
	 System.out.println("C grade");
 }
 else if(marks<=70&&marks>=40)
 {
	 System.out.println("Student is pass");
 }
 else if(marks>100)
 {
	 System.out.println("Papers wrong checked");
 }
 else
 {
	 System.out.println("Student is fail");
 }

System.out.println("end of programm");















}

}
