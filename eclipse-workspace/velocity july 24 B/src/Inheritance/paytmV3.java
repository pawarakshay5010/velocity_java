package Inheritance;

public class paytmV3 extends paytmV2        
{


public void SHOPPING()
{
	
	System.out.println("SHOPPING");
}

public static void main(String[] args)     //multilevelinheritance
{
	
	paytmV3 P=new paytmV3();
	P.recharge();
	P.bus_trainbooking();
	P.SHOPPING();
	
	
	
	
}
}

	  

