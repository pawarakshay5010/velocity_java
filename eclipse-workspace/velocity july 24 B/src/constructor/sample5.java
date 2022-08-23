package constructor;

public class sample5 
{
	public static void main(String[] args) 
	{
		
		
		sample5 S5=new sample5();
		S5.addition();
		
		sample5 S6=new sample5();
		S6.multi();
		
		
	}

	              // user defined constructor
	
	
	
	int a;     //variable declaration
	int b;
	
	
	
	sample5()                  //variable initialization
	{
		a= 500;             
		b=400;
		
	}
	public void addition()
	{
		int sum=a+b;                //usage 
		System.out.println(sum);
	}
	
	
	public void multi()
	{
		int multiValue=a*b;
		System.out.println(multiValue);
		
	}
	

	
	
	
}
