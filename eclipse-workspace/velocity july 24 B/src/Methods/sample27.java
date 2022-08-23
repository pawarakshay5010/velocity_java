package Methods;

public class sample27 
{
	public static void main(String[] args)
	{
		
		
		studentname();
		studentname("ANIKET",11,'A',80.51f);
			
	}
	public static void studentname()
	{
		String sname="student name:"+"NEHA";
		int srollnumber= 22;
		char sgrade='A';
		float sper= 70;
		
		System.out.println(sname);
		System.out.println(srollnumber);
		System.out.println(sgrade);
		System.out.println(sper);
		
	}
	
	public static void studentname(String sname,int srollnumber,char sgrade, float sper)
	{
		System.out.println(sname);
		System.out.println(srollnumber);
		System.out.println(sgrade);
		System.out.println(sper);
		
		
		
		
	}
	
	
	
	
	

}
