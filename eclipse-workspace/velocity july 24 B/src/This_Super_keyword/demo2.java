package This_Super_keyword;

public class demo2 extends demo1
{

	int c=222222222;          // global variable from same class
	
	public void m3()
	{
		int c=333333333;               //local variable
		System.out.println(c);                
		System.out.println(this.c);     //global variable from same class                 //this keyword is used to access global variable from same class
		System.out.println(super.c);     //global variable from diffrent  class           //super keyword is used to access global variable from diffrent  class
	}
	
	
	public static void main(String[] args)
	{
		
		demo2 s2=new demo2();
		s2.m3();
		
		
	}
	
	
	
}
