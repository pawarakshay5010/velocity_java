package abstract_concrete;

public class c2 implements c1          //implementation class
{

	
	public void m1()
	
	{
		
		System.out.println("m1");
	}
	
	
	
public void m2()
	
	{
		
		System.out.println("m2");
	}
	
public void addition(int a, int b)

{
	int sum=a+b;
	
	System.out.println(sum);
}

	
	public static void main(String[] args)
	{
		
		
		c2 c=new c2();
		c.m1();
		c.m2();
		c.addition(500, 56323);
		
		
	}
	
	
	
}
