package variable_types;

public class sample1 
{                                                   //variables are of 4 types: 1) global variable- declaring variable outside the method is called...
                                                 //                        2) local variable-- declaring variable inside the method is called ...
int a=10;    // global variable                   //                       3)static variable-- declaring variable with static keyword is called...
                                                  //                       4)non-static---- declaring variable without static keyword is ..........
public void  m1()                                  //
{
	int b=20;  // local variable
	
	System.out.println(b);
}
 
	public  void m2()
	{
		
		System.out.println(a);  // we can use global variable anywhere because its scope is throughtout the class
	}
	
	
	public  void m3(int c)  // local variable 
	{
		
		System.out.println(a);  // we can use global variable anywhere
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		
		sample1 A1=new sample1();
		A1.m1();
		
		
		sample1 A2=new sample1();
		A2.m2();
		
		
		
		
		
		
	}
	

	
	
	
	
}
