package practice___________________;

public class this_a1
{

	

	int a=100000;            //global variable
	
	
	
	public void addition() {
		
		
		int a=20;                         //local variable
		System.out.println(a);
		System.out.println(this.a);
	}
	
	
	public static void main(String[] args)
	{
		
		this_a1 d=new this_a1();
		d.addition();
	
	

}}