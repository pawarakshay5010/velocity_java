package Methods;

public class sample1 
{                                                      //methods are the block of code which only runs when it is called
                                                               //methods are used to perform any action
	public static void main(String[] args)
	{ 
//		  
		System.out.println("main method started");
//		
//		
	m1();  //methodname();    staic regular method call from same class
		m2();
//		
//		
		System.out.println("main method ended");
		
	}	
		
		
		public static void m1()                 //declaring a method with static keyword is called static regular method
		{
			System.out.println("running static regular method: m1");
		
		}
		
		public static void m2()
		{
		
			System.out.println("running static regular method: m2");
	}
	
	
	
}
