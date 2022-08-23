package constructor;

public class sample7 
{
 public static void main(String[] args) 
 {
	
	 
	 sample7 A1=new sample7();
	 A1.addition();
	
	sample5 S5=new sample5();
	S5.addition();              // non static object from difrent class
	 
	 
 }
	 
	 
	 int a;
	 int b;
	 int c;
	 int d;
	 


	sample7()
	{
		a=10000;
		b=4000;
		c=5000;
		d=9000;
	
	}
	 public void addition()
	 {
		 int sum=a+b+c+d;
		 System.out.println(sum);
		 
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
	
	