package interface_implementation;

public class demo2 implements demo1
{

	public void addition(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
		
	}
	
	
	

	public void addition(int a, int b, int c)
	{
		int sum=a+b+c;
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args) 
	{
		
		demo2 a1=new demo2();
		a1.addition(10, 90);
		a1.addition(100, 500, 20000);
		
		
		
	}
	
	
	
	
	
}
