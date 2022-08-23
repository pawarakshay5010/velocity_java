package This_Super_keyword;

public class b1 
{

	int a=5;              //global variable
	int b=11;
	
	
	public void m1()
	{
		int a=10;            //local variable
		
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) 
	{
		
		
		
		b1 c=new b1();
		c.m1();
		
		
		
		
	}
	
	
	
	
}
