package logical_programe2;

public class b1_reverse_number 
{
public static void main(String[] args) {
	
	
	
	int a = 1234567;
	
	
	String s = Integer.toString(a);
	
	
	String b="";
	
	
	
	for(int i=s.length()-1; i>=0; i--)
	{
		
		b=b+s.charAt(i);
		
	}
	
	int rev_number = Integer.parseInt(b);
	
	System.out.println(rev_number);
	
}
}
