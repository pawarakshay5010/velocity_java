package String_class;

public class example1
{
public static void main(String[] args)
{

	
	
	String c1="VELOCITY";
	
	String c2="ABCD";
	String c3="velocity";
	String c4="VELOCITY";
	String c5="city";
	String c6="";
	String a7="akshay pawar";
	
	String c7="manual classes manual";
	
	String c8="akshay";
	
	//System.out.println(c1=c4);
	
	System.out.println(c1.length());
	
	System.out.println(c1.toLowerCase());
	
	System.out.println(c2.toUpperCase());
	
	System.out.println(c1.startsWith("VE"));
	
	System.out.println(c5.startsWith("ty"));
	
	System.out.println(c2.endsWith("CD"));
	
	System.out.println(c3.endsWith("ci"));
	
	System.out.println(c1.equals(c4));
	
	System.out.println(c1.equals(c3));
	
	System.out.println(c1.equalsIgnoreCase(c3));
	
	System.out.println(c3.contains(c5));
	
	System.out.println(c4.contains(c5));
	
	
	System.out.println(c6.isEmpty());
	
	System.out.println(c8.isBlank());
	
	System.out.println(c8.charAt(5));
	
	System.out.println(c2.charAt(1));
	
	System.out.println(c2.concat(c5));
	
	System.out.println(c2+c5);
	
	
	System.out.println(c7.replace("manual", "AUTOMATION"));
	
	System.out.println(c8.replace("akshay", "NIKHIL"));
	
	
	System.out.println(c1.indexOf('T'));
	
	
	System.out.println(c2.indexOf('C'));
	
	System.out.println(c8.lastIndexOf('a'));
	
	
	System.out.println(c5.substring(1));
	
	System.out.println(c1.substring(4, 8));
	
	System.out.println(c8.substring(2));
	
	
	//System.out.println(a7.trim());
	
	//System.out.println(c4.split(c5));
	
}
}
