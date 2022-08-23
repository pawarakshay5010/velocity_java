package Exception;

public class sample5
{
public static void main(String[] args)
{
	
int a=50;
int b=0;
int c=0;

	
	try 
	{
		c=a/b;

		
	}                                        //when we dont have any idea which exception we will get then use "Generic exception"
	
	catch (Exception e)                  //generic exception -->super most exception
	{
		System.out.println("generic exception handled");
		e.printStackTrace();
	}
	
	System.out.println(c);
	
	
	System.out.println("velocity");
	
	
	
	
	
	
}
}