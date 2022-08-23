package practice___________________;

public class method_overloading 
{

	
	public void addition(int a , int b)
	{
		
		System.out.println("a+b");
	}
	
	
	
	public void addition(int a, int b, int c)
	{
		
		System.out.println("a+b+c");
	}
	
	public void addition(int a )
	{
		
		System.out.println("a");
	}
	
	public void addition()
	{
		
		System.out.println("addition");
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		method_overloading b=new method_overloading();
		b.addition();
		b.addition(50);
		b.addition(100, 200);
		b.addition(100, 200, 200);
	}
	
	
	
	
	
}
