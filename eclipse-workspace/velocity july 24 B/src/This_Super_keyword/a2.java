package This_Super_keyword;

public class a2 extends a1
{

	int x=2001;
	int y=2002;
	int z=2003;
	
	public void methodA1()
	
	{
		int x=3001;
		int y=3002;
		int z=3003;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println(this.z);
		System.out.println(super.x);
		System.out.println(super.y);
		System.out.println(super.z);
	
		
	}
	
	public static void main(String[] args)
	{
		
		a2 b1=new a2();
		b1.methodA1();
	
		
		
	}
	
	
	
	
}
