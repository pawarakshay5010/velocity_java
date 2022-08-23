package Methods;

public class all_covered 
{

	public static void addition()        //static regular method without parameters
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
		
	}
	
	public static void addition(int a, int b)      //static regular method with parameters
	
	{
		int sum=a+b;
		
		System.out.println(sum);
	}
	
	public void subtraction()
	{
		int a=50;
		int b=25;
		int c=a-b;
		System.out.println(c);
	}
	
	public void sub(int a, int b)          //non static regular method with parameters
	
	{
		int sum=a-b;
		
		System.out.println(sum);
	}
	
	
	public void multiply(int a, int b)      //non static regular method with parameters
	
	{
		int sum=a*b;
		
		System.out.println(sum);
	}
	
	public void sub(int a, int b,int c)   //non static regular method with parameters
	
	{
		
		int sub=a-b-c;
		System.out.println(sub);
	}
	
	
	
	public static void main(String[] args)
	{
		
		addition();
		
		addition(100, 200);
		
		all_covered s=new all_covered();
		s.subtraction();
	
		all_covered w=new all_covered();
		w.sub(100, 1);
		
		all_covered b=new all_covered();
		w.multiply(100, 1);
		
		all_covered g=new all_covered();
		g.sub(500, 300,100);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
