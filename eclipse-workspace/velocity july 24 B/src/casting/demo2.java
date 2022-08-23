package casting;

public class demo2 extends demo1          //sub class
{

	

	public void home()
	{
		
		System.out.println("home:6bhk");
	}
	

	public void money()
	{
		
		System.out.println("money:10L");
	}
	
	
	
	public void car()
	{
		
		System.out.println("car:RANGE ROVER VELAR");
	}
	public void m1()
	
	

		{
		System.out.println("m1");	
		}
	
	public static void main(String[] args) 
	{
		
		
		
		demo1 a1=new demo2();
		a1.car();
		a1.money();
		a1.home();
	
		
		
	}
	
	
	
	
}
