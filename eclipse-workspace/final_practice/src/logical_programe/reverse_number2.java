package logical_programe;

public class reverse_number2 
{
public static void main(String[] args)
{
	
	
	
	int num=123456789;
	
	String a = Integer.toString(num);
	
	
	String b="";
	
	for(int i=a.length()-1; i>=0;i--)
	{
		b=b+a.charAt(i);
		
		
	}
	
	
	
	int n = Integer.parseInt(b);
	
	
	System.out.println(n);
	
	
	
}
}
