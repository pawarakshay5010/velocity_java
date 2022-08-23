package String_class;

public class sample3
{
public static void main(String[] args) 
{
	
	
	
	
	String b1=new String("SAMSUNG");
	String b2=new String("sony");
	String b3=new String("SAMSUNG");
	String b4=new String("IPHONE");
	
	
	String b5="SAMSUNG";
	String b6="SAMSUNG";
	String b7="LG";
	String b8="";
	
	
	System.out.println(b1.length());
	System.out.println(b7.length());
	System.out.println(b3.toLowerCase());
	System.out.println(b2.toUpperCase());
	System.out.println(b4.isBlank());
	System.out.println(b8.isEmpty());
	System.out.println(b1==b3);
	
	System.out.println(b1==b5);
	System.out.println(b5==b6);
	
	System.out.println(b1.equals(b3));
	
	
	
	
	
	
	
	
	
	
}
}
