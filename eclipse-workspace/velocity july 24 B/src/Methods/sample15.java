package Methods;

public class sample15
{
public static void main(String[] args)
{
	System.out.println("main method started");
	
	
	sample14 mobilebrand= new sample14();
	
	mobilebrand.SAMSUNG();
	mobilebrand.APPLE();
	mobilebrand.LG();
	
	sample15 carbrand= new sample15();
	carbrand.TOYOTA();
	carbrand.TESLA();
	
	System.out.println("main method ended");
}
  public void TOYOTA()
  {
	  System.out.println("car brand1 :TOYOTA");
  }
	public void TESLA ()
	{
		System.out.println("car brand2 :TESLA");
	}
	
	
}
