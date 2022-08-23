package variable_types;

public class sample4
{

	// example of non static 
	int d=80;
	
	public static void main(String[] args)
	{
		
		
		sample4 A4= new sample4();  //object creation of same class
		System.out.println(A4.d);       // objectname.variablename    
		
		sample3 A3=new sample3();   //object creation of diffrent class
		System.out.println(A3.c);   // objectname.variablename             non static variable from diffrent class
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
