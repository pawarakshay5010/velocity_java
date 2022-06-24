package logical_programe2;

public class b2_reverse_number_without
{
public static void main(String[] args) {
	
	
	
	int num=54321;
	
	int b=0;
	
	for(int i= num; i>0; i=i/10)
	{
		
		
		int c=i%10;
		
		b=b*10+c;
		
	}
	
	
	
	System.out.println(b);
	
	
	
	
	
	
	
	
}
}
