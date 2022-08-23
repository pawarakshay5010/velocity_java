package practice___________________;

public class methods1
{

	public static void addition()    //static method
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	
	public void sub()          //non static method
	{
	int a=50;
	int b=10;
	int c=a-b;
	System.out.println(c);
	}
	
	
	
	public static void main(String[] args)
	{
	
		
		addition();            //methodNmae();
		
		 
		methods1 h=new methods1();       // classname objectname=new classname();
		                                      //  objectname.methodname();
		h.sub();
		
		
	}
	
	
	
	
	
	
	
	
	
}
