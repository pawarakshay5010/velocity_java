package Exception;

public class sample6
{
public static void main(String[] args)
{

	
	int a=100;
	int b=0;
	int c;
	
	int s []=new int [10];
	
	
	
	try 
	
	
	{
		c=a/b;        //risky code
		
		
	}
	
	catch(ArithmeticException e)
	{
		
		System.out.println("ArithmeticException handled");
		c=a/2;
	
	}
	System.out.println(c);
	
	System.out.println("..............................................................");
	
	
	

	try 
	
	
	{
		s[15]=500;       //risky code
		
		
	}
	
	catch(ArrayIndexOutOfBoundsException f)
	
	{
		
		System.out.println("ArrayIndexOutOfBoundsException handled");
	}
	
	
	System.out.println("..............................................................");
	
	try 
	
	
	{
		c=a/b;       //risky code
		
		
	}
	
	catch(Exception g)
	{
		System.out.println("generic exception handled");
		g.printStackTrace();
		
	}
	
	
}
}
