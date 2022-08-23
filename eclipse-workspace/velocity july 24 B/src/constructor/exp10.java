package constructor;

public class exp10 {



int num1;   
int num2;

exp10(int a, int b)
{
	num1=a;
	num2=b;
	

}
public void addition()
{
	int sum= num1+num2;
	System.out.println(sum);

}
public void multiplication()
{
	int sum= num1*num2;
	System.out.println(sum);

}

public static void main(String[] args) 
{
	
	exp10 s10=new exp10(100,200);
	s10.addition();
	s10.multiplication();
	
	
	
	
}
}