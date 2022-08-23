package constructor;

public class sample3
{                                                    // example of default constructor

	public static void main(String[] args)
	{
		
		
		sample2 S2=new sample2();
		S2.multiplication();
		
	System.out.println("..........................................................");	
	
		sample3 S3= new sample3();
		S3.subtraction();
		
		System.out.println("..........................................................");	
		
		
	sample3 S4= new sample3();
	S4.addition();
		
		
	}
	
	public void subtraction()
	{
	int a=10000;
	int b=500;
	int sum=a-b;
	System.out.println(sum);
	
	}
	
	public void addition()
	{
		int a=100000000;
		int b=3000000;
		int sum=a+b;
		System.out.println(sum);
	}
	
	
	
	
	
	
}
