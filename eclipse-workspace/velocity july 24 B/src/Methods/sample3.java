package Methods;

public class sample3 
{
public static void main(String[] args)
{
	System.out.println("main method started");
	
	
	sample1.m1();  
	m3();
	m4();
	
	System.out.println("main method ended");
}
	
	public static void m3()
	
	{
		System.out.println("running static regular method:m3");
	}
	
	
	public static void m4()
	
	{
		System.out.println("running static regular method:m4");
	}
	
	
}
