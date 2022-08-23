package String_class;

public class example5 
{
public static void main(String[] args) 
{
	
	String s1="TATA";
	String s2="HARRIER";
	String s3="SAFARI";
	String s4="tata";
	String s5="car";
	String s6=" SKY";
	String s7=" steel";
	String s8="TATA SAFARI";
	
	
	System.out.println(s2.length());
	System.out.println(s1.equals(s4));
	System.out.println(s1.equalsIgnoreCase(s4));
	System.out.println(s3.toLowerCase());
	System.out.println(s7.toUpperCase());
	System.out.println(s1.concat(s6));
	System.out.println(s4.charAt(3));
	System.out.println(s2.indexOf('I'));
	System.out.println(s2.lastIndexOf('R'));
	System.out.println(s2.isEmpty());
	System.out.println(s2.substring(3));
	System.out.println(s2.substring(3, 7));
	System.out.println(s7.replace("steel", "HOUSING"));
	System.out.println(s1+s6+s1+s7);
	System.out.println(s8.contains(s1));
	System.out.println(s3.startsWith("SA"));
	System.out.println(s8.endsWith("RI"));

System.out.println();
}
}