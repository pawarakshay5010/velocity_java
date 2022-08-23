package Methods;

public class sample24 
{

	public static void subtraction()
	
	{
		int a=1000;
		int b=500;
		int c=a-b;
		System.out.println(c);
	}
	
	public static void subtraction(int a, int b)
	{
		int sum= a-b;
		System.out.println(sum);
		
	}	
		
	public static void multiplication(int s, int t)
	{
	int sum= s*t;
	System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		
		subtraction();
		subtraction(5000,200);
		multiplication(10,10);
	}
}
