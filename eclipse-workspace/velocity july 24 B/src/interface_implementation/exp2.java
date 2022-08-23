package interface_implementation;

public class exp2 implements exp1
{

	public void addition1(int num1, int num2)
	{
		
		int sum=num1+num2;
		System.out.println(sum);
	}
	
	
	public void addition2(int num1, int num2)
	{
		
		int sum=num1+num2;
		System.out.println(sum);
		
	}
	
	
	public void multiply(int num1, int num2)
	{
		
		int e=num1*num2;
		System.out.println(e);
	}
	
	
	
	public static void main(String[] args)
	{
		
		exp2 o2=new exp2();
		o2.addition1(100, 555);
		o2.addition2(4956, 88452);
		o2.multiply(45, 4562);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
