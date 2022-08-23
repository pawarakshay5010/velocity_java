package polymorphism;

public class sample3
{

	public void addition(int a, int b)
	{
		int sum =a+b;
		System.out.println(sum);
		
	}
	
	
	public void addition(int a, int b,int c)
	{
		int sum =a+b+c;
		System.out.println(sum);
		
	}
	
	
	
	
	public void addition(int a, int b,int c,int d)
	{
		int sum =a+b+c+d;
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args)
	{
		sample3 o =new sample3();
		o.addition(100, 200);
		o.addition(100, 200, 300);
		o.addition(10, 845, 87565, 4152);
	}
	
	
	
	
	
}
