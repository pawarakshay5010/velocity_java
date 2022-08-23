package constructor;

public class exp1
{
	
	
	
	int num1;
	int num2;

  exp1()               //constructor without parameter
{
	 num1 =100;
	  num2 =12;
}

	public void addition()
	{
		
		int sum=num1+num2;
		System.out.println(sum);
		
		
	}
	public static void main(String[] args)                  // example of user defined constructor witout parameter
	{
	  exp1 s1=new exp1();
	  s1.addition();
	}

	
	
	
}

