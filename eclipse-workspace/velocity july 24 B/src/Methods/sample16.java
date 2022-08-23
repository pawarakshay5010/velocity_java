package Methods;

public class sample16 
{
public static void main(String[] args) 
{
	System.out.println("main method started");
	
	
	//classname objectname= new classname();
	sample16 A1= new sample16();
        A1.method11();                //objectname.methodname();	
	sample16 A2= new sample16();
	A2.method12();
	sample16 A3= new sample16();
	A3.method13();
	sample15 carbrand= new sample15();
	carbrand.TOYOTA();
		
	System.out.println("main method ended");
	
}	
	
	public void method11()
	{
		System.out.println("running non static regular: method11");
	}
	public void method12()
	{
		System.out.println("running non static regular: method12");
}
	
	public void method13()
	
	{
		System.out.println("running non static regular: method13");
}
	
	
}
















