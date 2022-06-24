package oops_poly;

public class sample1              //overloading
{

	
	
	public void studentname()
	{
		String n="Akshay";
		System.out.println(n);
		
	}
	
	
	public void studentname(String a)
	{
		
		System.out.println(a);
		
	}
	
	public void studentname(String a,String b)
	{
		String all= a+b;
				System.out.println(all);
		
	}
	
	
	public static void main(String[] args) {
		
		
	 sample1 s= new sample1();
	 s.studentname();
	 s.studentname("NIKHIL");
	s.studentname("rahul", "GIRISH");	
		
		
		
		
		
	}
//	public void studentname(String a,String b,String c)
//	{
//		
//		System.out.println(n);
//		
//	}
//	
	
	
	
	
	
	
	
	
	
}

