package Methods;

public class sample14 
{
public static void main(String[] args)
{
	System.out.println("main method started");
	
	//className objectName=new className();
	//objectName.methodName();
	 
	sample14 mobilebrand=new sample14();
	mobilebrand.SAMSUNG();
	mobilebrand.APPLE();
	mobilebrand.LG();

	System.out.println("main method ENDED");
	
}
  public void SAMSUNG()
  {
	  System.out.println("mobile brand1: SAMSUNG");
  }
public void APPLE()
   {
	   System.out.println("mobile brand2 : APPLE");
	}
   public void LG()

   {
	   System.out.println("mobile brand3 : LG");
   }

}
