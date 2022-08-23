package interface_implementation;

public class s3 implements s1 , s2
{

	public void addition1(int a, int b)
	{
		
		int sum=a+b;
		System.out.println(sum);
	}
	
	public void addition2(int a, int b)
	{
		
		int sum=a+b;
		System.out.println(sum);
	}
	
	
	public void multiplication1(int a, int b)
	{
		
		int sum=a*b;
		System.out.println(sum);
	}
	
	public void multiplication2(int a, int b)
	{
		
		int sum=a*b;
		System.out.println(sum);
	}
	

	
	public static void main(String[] args)
	{
		
		s3 b1=new s3();
		b1.addition1(10, 20);
		b1.addition2(50, 100);
		b1.multiplication1(100, 200);
		b1.multiplication2(100, 500);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
