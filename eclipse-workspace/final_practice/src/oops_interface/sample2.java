package oops_interface;

public  class sample2 implements sample1

{

public  void sname1() {
	System.out.println("running 1 ");
}

	
	
public  void sname2() {
	System.out.println("running 2 ");
}

	
	
public  void sname3() {
	System.out.println("running 3 ");
}

	
	public static void main(String[] args)
	{
	
		sample2 s = new sample2();
		
		s.sname1();
		s.sname2();
		s.sname3();
		
		
		
		
	}
	
}
