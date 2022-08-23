package abstract_concrete;

public class b2 extends b1            //concrete  class
{

	
	

	//public void addition()
//	{
	//	System.out.println("addition");    ///complete method
		
	//}
	
	
	
	public void subtraction(int a, int b)        //complete method
	
	{
		int sub=a-b;
		System.out.println(sub);
		
	}
	
	
	
public void multiply(int a, int b)           //complete method
	
	{
		int sum=a*b;
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) 
	{
		
		
		b2 o=new b2();
		o.addition();
		o.subtraction(10, 5);
		o.multiply(10, 10);
		
		
		
	}
	
	
	
}
