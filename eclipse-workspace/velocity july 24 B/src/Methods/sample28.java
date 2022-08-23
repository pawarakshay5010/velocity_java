package Methods;

public class sample28 
{
public static void main(String[] args) 
{
	
	m1(); // static regular method from same class

	sample28 A1=new sample28();  // classname.objectname=new classname();
	A1.m2();  // objectname.methodname();    // non-static regular method from same class
	
	//sample4.m5();  // static regular method from diffrent class
	
	sample13 s9=new sample13();  // non static regular method from diffrent class
	s9.m20();   
	
	
	multiplication();
	
	multiplication(4500,5226422);
	
	studentinfo("SAGAR",123,75.7f);
	
}
 public static void m1()
 {
	 System.out.println("running static regular method m1 from same class");
 }

public void m2()

{
	 System.out.println("running non-static regular method m2 from same class");
}

public static void multiplication()
{
	int a=1800000;
	int b=1000000;
int c=a*b;

System.out.println(c);
}
public static void multiplication(int a, int b)
{
	int sum=a*b;
	System.out.println(sum);

}

public static void studentinfo(String sname, int rollnumber, float sper)
{
	System.out.println("STUDENT NAME:"+sname);
	System.out.println("ROLLNUMBER:"+rollnumber);
	System.out.println("PERCENTAGE:"+sper);
	
}




}
