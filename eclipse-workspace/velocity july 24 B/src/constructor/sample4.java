package constructor;

public class sample4 
{

		int c;
		int d;
		
		sample4()
		{
			c=5;
			d=10;	
			
		}
		
		public void addition()
		{
		int e= c+d;
		System.out.println(e);
			
		}
		public void multiply()
		{
			int f=c*d;
			System.out.println(f);
		}
		

		public static void main(String[] args) 
		{
			
			
			sample4 S4 = new sample4();
			S4.addition();
		
			sample4 S5 = new sample4();
			S5.multiply();
			
		}	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

