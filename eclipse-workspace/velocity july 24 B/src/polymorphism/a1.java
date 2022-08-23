package polymorphism;

public class a1                     //method overloading

{

	
	public void addition(int a, int b, int c)
	{
		int sum=a+b+c;
		
		System.out.println(sum);
		
	}
	
	public void addition(int a, int b )
	{
		int sum=a+b;
		
		System.out.println(sum);
		
	}
	
	public void addition(int a, int b , int c, int d)
	{
		int sum=a+b+c+d;
		
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args) 
	{
		
		
		a1 m=new a1();
		m.addition(10, 20);
		m.addition(20, 30, 40);
		m.addition(50, 60, 40, 100);
		
		
		
		
		
		
	}
	
	
}
