package logical_programe2;

public class a7_armstrong 
{
public static void main(String[] args) {
	
	
	int a=370;
	
	int b=0;
	
	
	for(int i=a; i>0;i=i/10)
	{
		
		int c=i%10;
		
		b=b+(c*c*c);
		
		
	}	
	
	
	System.out.println(b);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
