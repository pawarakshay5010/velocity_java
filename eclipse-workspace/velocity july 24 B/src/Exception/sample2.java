package Exception;

public class sample2 
{
public static void main(String[] args)
{

	
	int a=10;
	int b=0;
	int c;
	
	
	try
	
	{
		 c=a/b;      //risky code   ---> event or exception

	}
	
	catch(ArithmeticException q1)   //(exception_name variablename)
	{
		
		System.out.println("ArithmeticException handled");
		c=a/1;                                                  
	}

	System.out.println(c);
	System.out.println("hiii");
	
}
}
