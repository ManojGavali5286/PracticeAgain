package stringPackage;

public class StringOfJava 
{
	public static void main(String[] args) {
		
	
	String a="Rahul";
	int ab=100;
	
	System.out.println(a);
	System.out.println(ab);
	
	String c="manojgavali@gmail.com";
	
	String d=new String("Manoj");
	System.out.println(d);
	
	System.out.println(c);
	
	String e = "manoj";		
	String b = "Rahul";	
	String f = "MANOJ";	
	String g = "akshay";
	
  String m= "KIshorkumar";
//Address or location of storage checking
	
	System.out.println(e==f);  //T
	System.out.println(b==f);  //F
	System.out.println(g==f);  //F
	
	//data checking
	System.out.println(e.equals(b));
	System.out.println(e.equals(f));
	System.out.println(e.equals(g));
	
	//we getting no.char
	//int as=e.length();
	//System.out.println(as); or
	System.out.println(e.length());
	
	System.out.println(e.charAt(1)); //manoj [1]-->a
	
	System.out.println(e.concat(g)); // manojakshay
	
	System.out.println(e.toUpperCase());  //MANOJ
	System.out.println(b.toLowerCase());  //rahul
	
	System.out.println(e.startsWith("man")); //true--> its checking data start   with "man" or not.
	System.out.println(e.endsWith("l"));// false-->its checking data end with  "j" or not.
	
	System.out.println(e.equalsIgnoreCase(f));   // checking the values only ignoring the upper/lower case format
	
	System.out.println(e.substring(2)); // from letter 2 to further letters will printed 
	
	System.out.println(m.substring(1 , 6)); //ishor --> kishorkumar (1,6--index --start and end)
	
	System.out.println(m.trim());
	}
}
