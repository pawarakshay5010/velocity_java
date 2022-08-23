package Arrays;

public class array4 
{

	public static void main(String[] args) 
	{
	
		
		int [][] p= {{100,200,300},{20,60,41},{50,69,74}};
		
		
		System.out.println(p.length);
		
		
		System.out.println(p[2][2]);
		
		System.out.println(".........................................");
		
		for(int i=0; i<=2; i++)
		{
			
			for(int j=0; j<=2; j++)
			{
				
				System.out.print(p[i][j]+"   ");
			}
			System.out.println();
			
		}
		
		
		
	}
}
