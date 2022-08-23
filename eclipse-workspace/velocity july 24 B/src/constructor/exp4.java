package constructor;

public class exp4 
{
 
	int num1;
	int num2;
	String studentname;

	exp4(int a, int b)        //user defined with parameter
	
	{
		num1=a;
		num2=b;
	
	}

	exp4(String sname)
	
	{
		studentname=sname;
	
	}
	
	public void addition()
	{
		int sum =num1+num2;
		System.out.println(sum);
		
		
	}
	
	
	public void studentINFO()
	{
		System.out.println(studentname);
		
		
	}

	public static void main(String[] args)           // multiple constructor in same class but with diffrent parameter
	{
		
		exp4 s4=new exp4(5000,4000);
		s4.addition();
		
		{
			System.out.println(".......................");
		}
		
		exp4 s5=new exp4("AKSHAY");
		s5.studentINFO();
	
		
	}
	
	
}
