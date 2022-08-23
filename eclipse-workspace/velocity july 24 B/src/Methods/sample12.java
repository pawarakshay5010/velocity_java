package Methods;

public class sample12 
{

	
	public void m3()
	{
		System.out.println("running non static regular method m1 from diffrent class");
	}
	
	public void m4()
	{
		System.out.println("running non static regular method m2 from diffrent class");
	}
	
	public static void main(String[] args)
	{
		System.out.println("main method started");
		
	
		sample11 s7 = new sample11();
		s7.m1();
		s7.m2();
		
		
		
		System.out.println("main method ended");
	}
	
	
}

