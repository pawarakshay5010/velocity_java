package interface_implementation;

public class example2 implements example1
{

	public void car()
	{
		
		System.out.println("car:TATA harrier");
	}
	
	

	public void home()
	{
		
		System.out.println("home:5bhk");
	}
	
	
	

	public void money()
	{
		
		System.out.println("money:10000$");
	}
	
	
	
	
	public static void main(String[] args)
	{
		
		example2 o=new example2();
		o.car();
		o.home();
		o.money();
		
		
		
	}
	
	
	
	
	
	
	
	
}
