package zz;

public class sample1
{

	
	
	int a=10;
	
	public void addition()
	{
		
		int a=20;
		int b=50;
		
		int sum=a+b;
		
		System.out.println(sum);
		
		
		
		
	}
	
	public static void add()
	{
		
		int a=100;
		int b=200;
		
		int sum=a+b;
		System.out.println(sum);
		
		
	}
	
	
	public void addition(int c, int d)
	
	{
		
		int add=c+d;
		System.out.println(add);
		
		
	}
	
	
	
	public static void main(String[] args)
	{
	
		
		sample1 aa =new sample1();
		aa.addition();
		
		
		add();
		
		
		sample1 bb =new sample1();
		aa.addition(500, 500);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
