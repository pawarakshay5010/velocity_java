package Methods;

public class sample13 
{
public static void main(String[] args) 
{
	System.out.println("main method started");
	
	sample13 s9= new sample13();
	s9.m20();
	s9.m30();
	sample11 s6 = new sample11();
	s6.m1();
	
	System.out.println("main method ended");
	
}
	
	public void m20()
	{
		System.out.println("running non static regular method m20 from same class");
	}
	
	public void m30()
	{
		System.out.println("running  non static regular method m30 from same class");
	}
	
	
}

