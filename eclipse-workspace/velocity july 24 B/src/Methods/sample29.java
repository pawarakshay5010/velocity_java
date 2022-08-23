package Methods;

public class sample29 
{
public static void main(String[] args) 
{
	addition();
	subtraction(1000,400);
	subtraction(500000,5326);
	multiplication(125234,4551);
}

public static void addition()
{
	int a=5000;
	int b=1000;
	int c=a+b;
	System.out.println(c);

}
 public static void subtraction(int a, int b)
 {
int sum = a-b;
System.out.println(sum);
}
 public static void multiplication(int a, int b)
 {
 int sum=a*b;
 System.out.println(sum);
}
 
}