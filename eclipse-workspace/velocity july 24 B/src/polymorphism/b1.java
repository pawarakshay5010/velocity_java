package polymorphism;

public class b1         // compiletime polymorphism
{

	public void multiplication(int a, int b)         //method declaration
	{
		int sum=a*b;
		
		System.out.println(sum);
		
	}
	
	public void multiplication(int a, int b, int c)         //method declaration
	{
		int sum=a*b*c;
		
		System.out.println(sum);
		
	}
	
	public void multiplication(int a, int b, int c, int d)         //method declaration
	{
		int sum=a*b*c*d;
		
		System.out.println(sum);
		
	}
	
	
	
	public static void main(String[] args)
	{
		
		
		b1 w=new b1();
		w.multiplication(10, 20);                       
		w.multiplication(2, 10, 30);
		w.multiplication(1, 4, 50, 10);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
