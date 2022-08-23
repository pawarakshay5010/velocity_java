package constructor;

public class exp9 
{

	
	String mobilename;   // declaration
	int mobileprice;
	
	
	exp9(String mname, int mprice)     //initialization
	{
		mobilename=mname; 
		mobileprice=mprice;
	}
	
	public void MOBILEINFO()
	{
		System.out.println(mobilename);
		System.out.println(mobileprice);
	}
	
	public static void main(String[] args)              // with parameter

	{
		
		
		exp9 s9=new exp9("SAMSUNG S21 ULTRA", 85000);
		s9.MOBILEINFO();
		
		System.out.println("...........................");
		
		exp9 s10=new exp9("IPHONE 12MAX PRO",90000);
		s10.MOBILEINFO();

		exp9 s11=new exp9("adodfk",22000);
		s11.MOBILEINFO();

		
	}
}

