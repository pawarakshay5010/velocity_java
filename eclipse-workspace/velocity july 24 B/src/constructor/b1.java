package constructor;

public class b1
{

	int num1;
	int num2;                                       //without parameter
	
	
	
	b1()
	{
		num1=5000;
		num2=3000;
		
	}
	
	
	public void addition()
	{
		int sum=num1+num2;
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args)
	{
	
		
		b1 w=new b1();
		w.addition();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
