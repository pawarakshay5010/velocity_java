package Exception;

public class sample7 
{
public static void main(String[] args)
{

	
	int a=20;
	int b=30;
	int c=0;
	int d;
	
	
	try 
	{
		
		d=a+b/c;          //risky code
		
	}
	
	catch(ArithmeticException n)
	{
		
		System.out.println("ArithmeticException handled");
		d=a+b/1;
	}
	System.out.println(d);
	
	System.out.println("1000000000000");
	
	
	
	
}
}
