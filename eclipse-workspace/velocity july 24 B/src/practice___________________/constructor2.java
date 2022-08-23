package practice___________________;

public class constructor2
{

	
	int num1;
	int num2;
	int num3;
	String studentname;
	
	
	constructor2(int a, int b)
	{
		num1=a;
		num2=b;
		
		
	}
	constructor2(int a, int b, int c)
	{
		num1=a;
		num2=b;
		num3=c;
		
	}
	
	constructor2(String sname)
	{
		studentname=sname;
		
		
	}
	
	
	public void addition()
	{
		
		int t=num1+num2;
		System.out.println(t);
	}
	
	public void addition1()
	{
		
		int m=num1+num2+num3;
		System.out.println(m);
	}
	
	public void name()
	{
		
	
	
				System.out.println(studentname);
	}
	
	public static void main(String[] args) 
	{
	
		constructor2 b=new constructor2(100, 200);
		
		b.addition();
constructor2 j=new constructor2(100, 200, 200);
		
		j.addition1();
		
	
		constructor2 v=new constructor2("Priya");
		v.name();
		
		
	}
	
	
	
	
	
	
	
}
