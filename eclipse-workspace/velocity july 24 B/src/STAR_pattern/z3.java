package STAR_pattern;

public class z3
{
public static void main(String[] args)
{

	
	
   int space=10;
  int  star=1;
   
	
	for(int i=1; i<=10; i++)
	
	{
		for(int j=1; j<=space; j++)
		{
			
			System.out.print(" ");
		}
		
		for(int j=1; j<=star; j++)
		{
			
			
			System.out.print("*");
		}
	
		
		System.out.println();
		star=star+2;
		space=space-2;
	}
	
	
	
	
	
	
	
	
	
}
}
