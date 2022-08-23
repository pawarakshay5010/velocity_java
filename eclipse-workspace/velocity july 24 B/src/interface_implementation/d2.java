package interface_implementation;

public class d2 implements d1
{

	public void addition(int e , int f)
	{
		int sum=e+f;
		System.out.println(sum);
		
		
	}
	
	
	public void subtraction(int x , int y)
	{
		int c=x-y;
		System.out.println(c);
		
		
	}



	public void addtion(int a, int b) {
		
	}

	public static void main(String[] args)
	{
		
		d2 c1=new d2();
		c1.addition(10, 20);
		c1.subtraction(100, 10);
		
		
		
	}
	
	
	
}
