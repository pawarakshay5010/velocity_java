package Exception;

public class sample9
{
public static void main(String[] args) 
{

	int a=200;
	int b=0;
	int c=0;
	
	
	try 
	{
	    
		c=a/b;
		
	}
	
	catch(NullPointerException m)
	{
		System.out.println("NullPointerException handled");
		
	}
	
	
	catch(ArrayIndexOutOfBoundsException p)
	{
		
		System.out.println("ArrayIndexOutOfBoundsException handled");
	}
	
	
	
	catch(ArithmeticException s)
	{
		System.out.println("ArithmeticException handled");
	}
	
	

	catch(Exception u)
	{
		System.out.println("generic exception handled");
	}
	
	System.out.println("akshay");
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
