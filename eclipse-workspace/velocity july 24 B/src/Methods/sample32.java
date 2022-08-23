package Methods;

public class sample32
{
public static void main(String[] args)
{
	
	studentinfo("VISHAKHA",10001,'A',90.5f);

	
	{
		System.out.println("..........................");	
	}
	
	multiplication(100,100);                     //  static regular method from same class
	
	sample31 A31= new sample31();                  // non static regular method from diffrent class
	A31.m32();
	
	sample31.m31();                      //  static regular method from diffrent class
	
	sample32 A32=new sample32();           // non static regular method from same class
	A32.m34();                       
	
	
}

public static void studentinfo(String sname, int srollnumber, char sgrade, float sper)

{
	System.out.println(sname);
	System.out.println(srollnumber);
	System.out.println(sgrade);
	System.out.println(sper);

}
{
	System.out.println("..........................");	
}
public static void multiplication(int a, int b) 

{
	int c=a*b;
	System.out.println(c);

	{
		System.out.println("..........................");	
	}
}

public void m34()
{
System.out.println("running non ststic-m34");	
}

}
