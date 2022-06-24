package logical_programe2;

public class a5_pallindrom
{
public static void main(String[] args) {
	
	
	
	
	String a ="POP";
	
	
	String b="";
	
	
	
	for (int i =a.length()-1;  i>=0; i--)
	{
	
		
		b=b+a.charAt(i);
		
	}
	
	
	System.out.println(b);
	
	if(b.equals(a))
			{
		
		System.out.println("given string is pallindrome");
			}
	
	
	else
	{
		System.out.println("given string is nott a pallindrome ");
	}
	
	
	
	
	
	
	
}
}
