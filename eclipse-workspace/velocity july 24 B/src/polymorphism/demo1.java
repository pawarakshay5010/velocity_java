package polymorphism;

public class demo1 
{
	
public void multiply(int a, int b)
{
	int e=a*b;
	System.out.println(e);


}

public void multiply(int a, int b, int c)
{
	int f=a*b*c;
	System.out.println(f);


}


public static void main(String[] args)
{
	
	demo1 s1=new demo1();
	
	s1.multiply(100, 500);
	s1.multiply(452, 551, 1512);
	
	
	
}









}
