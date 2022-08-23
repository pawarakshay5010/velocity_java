package constructor;

public class SAMPLE10 
{
public static void main(String[] args)
{
	
	SAMPLE10 S10=new SAMPLE10();
	S10.subtraction();
	
	
}	
	int a;
	int b;
	
	SAMPLE10()
	{
	 a=100;
	 b=50;
	}
	
	public void subtraction()
	{
		int sum= a-b;
		System.out.println(sum);
		
		
	}
	
	
	
	
	
	
}

