package ALL_practice;

public class array2 
{
public static void main(String[] args) {
	
	
	
	
	
	int a [][]= {{41,5,2,3},{4,9,7,66},{4,6,74,6},{7,8,5,4}};
	
	
	System.out.println(a[2][3]);
	
	
	
	System.out.println(a.length);
	
	
	
	System.out.println("...........");
	
	
	for(int i=0; i<=a.length-1; i++)
	{
		
		for(int j=0; j<=a.length-1; j++)
		{
			
			System.out.print(a[i][j]+ "  ");
			
		}
		
		System.out.println();
		
	}
	
	
	
	
}
}
