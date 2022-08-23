package constructor;

public class sample8
{
public static void main(String[] args)         //user defined constructor
{
	
	sample8 S8=new sample8();
	S8.addition();
	
	
}
	
	int a;
	int b;
	int c;
	
	sample8()
	{
		a=1000;
		b=1000;
		c=1000;
		
	}
	
	public void addition()
	{
		int sum=a+b+c;
		System.out.println("total sum:"+sum);
	}
	
	
	
}

