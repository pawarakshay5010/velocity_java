package ALL_practice;

public class whitespaces 
{
public static void main(String[] args) {
	
	
	
	String a="ab  aksha         akdjd ";
	
	
	int b=0;
	
	
	for(int i=0; i<=a.length()-1; i++)
	{
		
		char vv = a.charAt(i);
		
		if(vv==' ')
		{
			
			b++;
			
			
		}
		
		
		
	}
	
	
	System.out.println(b);
	
	
	
	
	
	
	
	
	
	
}
}
