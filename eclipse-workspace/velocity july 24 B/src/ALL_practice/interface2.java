package ALL_practice;

public class interface2 implements interface1
{

	
	public void addition(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	
	

	public void sub(int c, int d)
	{
		int subtract =c-d;
		System.out.println(subtract);
	}
	
	
	public static void main(String[] args) {
		
		
		
		
		interface2 n=new interface2();
		
		n.addition(50, 400);
		n.sub(200, 880);
		
		
		
		
		
		
		
		
	}
	
	
	
}
