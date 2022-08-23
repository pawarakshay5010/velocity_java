package constructor;

public class exp2
{                                               //example of user defined constructor with parameter

	int num1;
	int num2;
	int num3;


	exp2(int a, int b, int c)               //constructor with parameter
	
	{
		num1=a;
		num2=b;
		num3=c;
		
	}
	
	public void addition()
	{
		int sum = num1+num2+num3;
		System.out.println(sum);
		
		
	}
	
	
	
	
	
}
