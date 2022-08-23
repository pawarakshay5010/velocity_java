package casting;

public class upcasting_father     // assigning  sub class properties into super class is called upcasting
{                                                      //during upcasting only the inherited properties are going to assign in superclass
                                                        // the new properties which are declared in subclass have no permission for upcasting
	
	public static void main(String[] args) 
	{
		
		
		father o1=new son();      //upcasting
		o1.car();
		o1.home();
		o1.money();
		
		
		
		
	}
	
	
	
	
}
