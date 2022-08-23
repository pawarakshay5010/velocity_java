package Methods;

public class sample20 
{
public static void main(String[] args)
{
	
	addition(); //without parameter method
	
	addition(100,200);  // with parameter method
	
	addition(1000,2000,3000); 
	
	
}
	
	public static void addition()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public static void addition(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	
	public static void addition(int a, int b , int e)
	{
	int sum=a+b+e;
	System.out.println(sum);
	
	}
	
	
	
}















