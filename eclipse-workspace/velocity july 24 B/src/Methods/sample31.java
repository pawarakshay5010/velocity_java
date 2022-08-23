package Methods;

public class sample31 
{


	public static void m31()
	{
		System.out.println("running m31");
	}

	public static void addition()
	{
	int a=900;
	int b=100;
	int c=a+b;
	System.out.println(c);
	}
	 
	public static void multiplication()
	{
		int a =5;
		int b=5;
		int e=a*b;
		System.out.println(e);
		
		
	}
	public static void addition(int f, int g)
	
	{
		int sum= f+g;
		System.out.println(sum);
		
	}
	
	public static void division(int a, int b)
	
	{
		int sum= a/b;
		System.out.println(sum);
		
	}
	
	public void m32()                    // non static regular method 
	{
		System.out.println("running non static - m32");
	}
	
	
	
	
	public static void main(String[] args)
	{
		
		m31();           // method without parameter
		
		 addition();
		
		 multiplication();
		
		addition(200000,40000);    // method with parameter
		
		division(1000,1000);
		
		sample31 A31= new sample31();  //object creation      classname objectname=new classname();
		A31.m32();                              // objectname.methodname();	
		
		
	}
	
	
	
	
	
	
	
	
}

