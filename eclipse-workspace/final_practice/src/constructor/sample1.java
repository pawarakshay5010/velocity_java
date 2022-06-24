package constructor;

public class sample1
{

	
	
	 sample1()                                  // without parameters
	{
		int num1=10000;
		int num2=20000;
		int sum=num1+num2;
		System.out.println(sum);
		
	}
	
	
	
	 sample1(int a, int b)               //with paerameters
	 
		{
			
			int sum=a+b;
			System.out.println(sum);
		}
		
	
	
	public static void main(String[] args) {
		
		
		
		sample1 o = new sample1();
		
		sample1 a = new sample1(100, 200);
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
