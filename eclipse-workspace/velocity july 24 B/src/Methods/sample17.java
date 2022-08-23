package Methods;


public class sample17
{
public static void main(String[] args) 
{
	
	m1111();  //static regular method from same class
	
	sample17 B1= new sample17();   //non static regular method from same class
	B1.m2222();
	
	sample1.m1();  // static regular method from diffrent class
	
	sample14 mobilebrand= new sample14();   //non static regular method from diffrent class
	mobilebrand.APPLE();
	
	
}

public static void m1111()

{
	System.out.println("running static regular method m1111 from same class");
}
 public void m2222()
 {
	 System.out.println("running non static regular method m2222 from same class");
 }
 
 public static void m1()
 {
	 System.out.println("running static regular method m1 from diffrent class");
 }
 
 public void APPLE()
 
 {
	 System.out.println("running non static regular method APPLE from diffrent class");
 }
 
}












