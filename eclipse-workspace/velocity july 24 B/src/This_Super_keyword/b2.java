package This_Super_keyword;

public class b2 extends b1
{

	int b=50;
	
	
	public void m2()
	{
		int b=40;            //local variable
		

				System.out.println(b);
				System.out.println(this.b);
				System.out.println(super.b);
	}
	
	public static void main(String[] args) 
	{
		
		b2 s=new b2();
		s.m2();
		
		
		
		
	}
	
	
	
	
	
	
	
}
