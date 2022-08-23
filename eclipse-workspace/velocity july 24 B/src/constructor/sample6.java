package constructor;

public class sample6
{

	
	int a;
	int b;
	
	
	public static void main(String[] args)
	{
		
		sample6 A6=new sample6();
		A6.addition();
		
		sample6 A7=new sample6();
		A7.division();
		
		sample6 A8=new sample6();
		A8.subtraction();
		
	}
	
	sample6()
	{
		a=10000000;
		b=7455562;
		
	}
	
	
	public void addition()

	{
		
		int sum= a+b;
		System.out.println(sum);
	}
	
	public void division()
{
	int sum=a/b;
	System.out.println(sum);
}
	
	public void subtraction()
	
	{
		int sum=a-b;
		System.out.println(sum);
	}
	
	
	
	
	
	
	
}
