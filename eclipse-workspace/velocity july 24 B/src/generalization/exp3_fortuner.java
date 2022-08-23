package generalization;

public class exp3_fortuner implements exp1_car  {


public void engine()
{
	
	System.out.println("engine:3000cc");
}




public void milage()
{
	
	System.out.println("milage:08");
}



public void price()
{
	
	System.out.println("price:35L");
}


public void m2()
{
	
	System.out.println("....m2..");
}


public static void main(String[] args) 
{
	
	{
		System.out.println(".........scorpio........................");
	}
	
	
	exp2_scorpio a=new exp2_scorpio();
	a.engine();
	a.milage();
	a.milage();
	a.m1();
	
	{
		System.out.println("..........fortuner........................");
	}
	
	
	exp3_fortuner b=new exp3_fortuner();
	b.engine();
	b.milage();
	b.price();
	b.m2();
}



}

