package constructor;

public class exp8 
{
public static void main(String[] args)            //without parameter
{
	
	exp8 s8=new exp8();
	s8.addition();
	
	System.out.println("...............................................");
	
	exp8 s9=new exp8();
	s9.multiplicationn();
	
	
}
	
	int num1;
	int num2;
	int num3;
	
	
	exp8()
	{
	 num1=100;
	 num2=200;
	 num3=400;
		
	}
	
	public void addition()
	{
		int sum =num1+num2+num3;
		
		System.out.println(sum);
		
	}

	public void multiplicationn()
	{
		int sum2 =num1*num2*num3;
		
		System.out.println(sum2);
		
	}
	
	
}

