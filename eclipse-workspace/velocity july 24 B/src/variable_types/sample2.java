package variable_types;

public class sample2 

{
                         //example of static global variable
  static int g=40;
	
	public static void main(String[] args)
	{

		System.out.println(g);           // static method from same class
		System.out.println(sample3.b);  // static method from diffrent class    classname.variablename
		
	}
	public void m3()
	
	{
		
		System.out.println(g);
	}
	
	
	
	
	
	
}
