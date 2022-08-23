package generalization;

public class testing_simcard
{
public static void main(String[] args)

{
	
	
	
	System.out.println("......jio..........");
	
	Jio j=new Jio();
	j.calling();
	j.internet();
	j.sms();
	
	
	System.out.println("......airtel..........");
	
	
	Airtel a=new Airtel();
	a.calling();
	a.internet();
	a.sms();
	
	
	System.out.println(".....VI..........");
	
	
	VI v=new VI();
	v.calling();
	v.internet();
	v.sms();
	
	
}
}
