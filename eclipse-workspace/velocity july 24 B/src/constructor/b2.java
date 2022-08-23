package constructor;

public class b2 
{

	int num1;
	int num2;
	
	
	b2(int a, int b)                          //with  parameter
	{
		num1=a;
		num2=b;
		
	}
	
	
	public void addition()
	{
		int sum=num1+num2;
		System.out.println(sum);
		
		
		
	}
	
	public static void main(String[] args)
	{

		b2 m=new b2(521232, 9864520);
		m.addition();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
