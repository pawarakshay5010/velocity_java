package logical_programe;

public class reverse_number_without_string {

	public static void main(String[] args) {
		
		
		
		
		
		int num1= 89381111;
		int num2=0;
		
		
		for(int i=num1; i>0;i=i/10) 
		{
			
			int c=i%10;
			
			num2=num2*10+c;
			
			
		}
		
		System.out.println(num2);
		
		
		
		
		
		
		
		
	}
}
