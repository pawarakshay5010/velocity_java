package constructor;

public class exp6
{
public static void main(String[] args)
{
	
	exp6 s6=new exp6(1000,5000);
	s6.multiplication();
	
}	

	
	
int input1;
int input2;

exp6(int a, int b)
{
 input1=a;
 input2=b;


}
	public void multiplication()
	{
		int total= input1*input2;
		System.out.println(total);
		
		
	}
	

}
