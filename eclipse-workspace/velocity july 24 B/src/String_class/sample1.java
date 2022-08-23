package String_class;

public class sample1 
{
public static void main(String[] args)
{
	
	
	      //string without using new 
	
	
	String s1="akshay";
	
	String s2="akshay";
	
	String s3="nikhil";

	
	//string with using new 
	
	
	String s4=new String("akshay");
	String s5=new String("aniket");
	String s6=new String("sagar");
	
	
	
	
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	System.out.println(s1==s1);
	
	System.out.println(s1==s4);
	System.out.println(s5==s6);
	
}
}
