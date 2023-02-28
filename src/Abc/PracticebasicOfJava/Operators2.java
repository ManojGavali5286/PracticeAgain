package Abc.PracticebasicOfJava;

public class Operators2
//comparision operators use boolean
{
public static void main(String[] args) 
{
	int a= 15;
	int b=25;
	
// = ---> assignment operator
//==  --->equal to operator
	
	System.out.println(a>b);// false boolean
	
	System.out.println(a<b);// true
	
	System.out.println(a!=b);//not eual to  ...true
	
	System.out.println(a<=b);//true
	
	System.out.println(a>=b);//false
	
	System.out.println(a==b);//false
//************************************************************************	
	//use logical operators
	//&& AND ---> accurate result required
	//|| OR ---> no need accurate result required
	//!  NOT ----> opposite result get
	
// two or more condition we compare
	//condition using if else statement
	
	char x= 'I';     // capital char matters if u chnage small i then it shows consonant
	
	if(x=='A'|| x=='E'||x=='I'|| x=='O'|| x=='U')
	
	{
		System.out.println(x +"   is vowels");
	}
	else 
	{
		System.out.println(x+"  is consonant");
	}

	System.out.println("end of programm");
	
	
	
	
	
	
	
	
}}
