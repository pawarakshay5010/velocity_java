package control_statement;

public class example11__nested_if 
{
public static void main(String[] args)
{
	
	String UN="abc";
	String PASS="xyz";
	
	if("abc"==UN)  //outer if
{
		System.out.println("correct UN");
	if("xyz1"==PASS)   // inner/nested if
	{
		System.out.println("correct PASS.......login successful");
	}
	else
	{
		System.out.println("wrong PASS.....login failed");
	}
}
	else
	   {
		   System.out.println("wrong UN");
	   }

	   
  
	
	
}
}
