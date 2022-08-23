package Methods;

public class sample11 
{
public static void main(String[] args)
{
	
	System.out.println("main method started");
	
	
	// className objectName= new className();
	
	sample11 s6 = new sample11(); //object creation    s6 is the object
	
	s6.m1();         //objectName.methodName();
	s6.m2();
	
	System.out.println("main method ended");  
	}
	

	public void m1()                 //declaring a method "without" static keyword is called non-static regular method
	{
		System.out.println("running NON static regular method m1 from same class");
	}
	
	public void m2()
	{
		System.out.println("running NON static regular method m2 from same class");
	}
}

