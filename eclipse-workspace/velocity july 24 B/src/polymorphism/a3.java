package polymorphism;

public class a3 extends a2
{

	                                      //overriding
	
	
	public void mobile()
	{
		
		System.out.println("iphone");
	}
	
	
	
	

	public void car()
	{
		
		System.out.println("mercedes");
	}
	
	
	public void laptop()
	{
		
		System.out.println("dell");
	}
	
	
	
	public static void main(String[] args) 
	{
		
		a3 l= new a3();
		l.car();
		l.laptop();
		l.mobile();
		
	}
	
	
	
	
	
	
	
	
	
}
