package logical_programe;

public class reverse_number 
{
public static void main(String[] args) {
	
	
	
	
	int n= 1245124;
	
	String a = Integer.toString(n);
	
	
	String b="";
	
	for(int i=a.length()-1; i>=0; i--)
	{
		
		
		b=b+a.charAt(i);
		
		
	}
	
	int num = Integer.parseInt(b);
	
	
	System.out.println(num);
	
	
	
	
	
	
	
	
}
}
