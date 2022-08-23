package control_statement;

public class example12__nested_if
{
public static void main(String[] args) 
{
	
	String username="AKSHAY";
	
	String password="xyz";
	
	if("AKSHAY"==username)
	{
		System.out.println("correct username ");
		
		if("xyz"==password)
		
		{
			System.out.println("correct password.....login successful");
		}
		
		else
		
		{
			System.out.println("wrong password......login failed");
		}
	}
		else
		{
			System.out.println("wrong username");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
