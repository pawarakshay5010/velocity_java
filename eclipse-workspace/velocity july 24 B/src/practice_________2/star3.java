package practice_________2;

public class star3 
{

	public static void main(String[] args)
	{
	
		
		
		int star=15;
		int space=0;
		
		
		for(int i=1; i<=8; i++)
		{
			
			
			for (int j =1; j <=space; j++) 
			{
				System.out.print(" ");
			}
			
			
			for (int j =1; j <=star; j++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
			star=star-2;
			space++;
			
		}
		
	}
}
