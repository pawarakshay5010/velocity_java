package constructor;

public class sample12
{
public static void main(String[] args) 
{
	
	sample12 s12=new sample12();
	s12.division();
	{
		System.out.println("...........................");
	}	
	sample11 s11=new sample11();
	s11.addition();                      //non static from diff class
	
	
}
	
	int a;
	int b;
	
	
	public void division()
	
	{
	a=10000;
	b=5000;
	int sum=a/b;
	
	
		System.out.println(sum);
	}
	

	
}

