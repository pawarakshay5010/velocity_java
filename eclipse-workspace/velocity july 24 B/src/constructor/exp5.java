package constructor;

public class exp5 
{
public static void main(String[] args) 
{
	
	exp5 s5=new exp5("AKSHAY", 369, 80.5f,'A');
	s5.studentINFO();
	
	
	
}
	
	String studentname;
	int studentrollnumber;
	float studentper;
	char studentgrade;
	
	
	exp5(String sname, int srollnumber, float sper, char sgrade)
	{
		studentname=sname;
		studentrollnumber= srollnumber;
		studentper=sper;
		studentgrade=sgrade;
		
	}
	
	public void studentINFO()
	{
		System.out.println(studentname);
		System.out.println(studentrollnumber);
		System.out.println(studentper);
		System.out.println(studentgrade);
	}
	
	
	
	
	
}
