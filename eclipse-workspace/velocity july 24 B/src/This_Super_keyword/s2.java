package This_Super_keyword;

public class s2 extends s1
{

	int e=333333;
	int f=5555;
	
	
	
	public void m1()
	{
	int e=44444;
	int f=999999999;
		System.out.println(e);        // local variable 
		
		System.out.println(f);           // local variable 
		
		System.out.println(this.e);       //global variable from same class
		
		System.out.println(this.f);          //global variable from same class
		
		System.out.println(super.e);           //global variable from diff class
		
		System.out.println(super.f);            //global variable from diff class
	}
	
	
	
	
	public static void main(String[] args)
	{
		
		
		s2 a1=new s2();
		a1.m1();
		
		
	}
	


	
}
