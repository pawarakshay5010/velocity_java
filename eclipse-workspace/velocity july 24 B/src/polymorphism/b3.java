package polymorphism;

public class b3 extends b2
{

	
	public void mobile()
	
	{
		System.out.println("iphone");                  
	}
	
public void car()
	
	{
		System.out.println("scorpio");
	}
	
	
public void laptop()

{
	System.out.println("hp");
}

	public void home()
	{
		System.out.println("2bhk");
	}
	
	
	public static void main(String[] args)
	{
		
		b2 r=new b3();
		r.car();
		r.laptop();
		r.mobile();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
