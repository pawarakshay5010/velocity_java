package polymorphism;

public class son extends father
{
                                     //method overriding --> acquiring super class methods to sub class with help of extends keyword and changing the defination as per subclass specification
	                                                        
	public void money()                 
	{
		
		System.out.println("money:2 L");      // defination changhed from 1L to 2L
	}
	
	
	
	public void car()
	{
		
		System.out.println("car:TOYOTA FORTUNER");
	}
	
	

	public void home()
	{
		
		System.out.println("home:3bhk");
	}
	
	
	
}
