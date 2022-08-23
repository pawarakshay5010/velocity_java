package Exception;

public class sample8
{
public static void main(String[] args) 
{

	
	int a=10000;
	int b=0;
	int c;
	
	
	try 
	{
		c=a/b;
		
		
	}
	catch(ArrayIndexOutOfBoundsException k)
	{
		System.out.println("ArrayIndexOutOfBoundsException handled");
	}
	
	catch(Exception h)
	{
		
		System.out.println("generic exception handled ");
		h.printStackTrace();
		
	}
	
	
	System.out.println("akash");
	
	
	
	
	
	
	
}
}
