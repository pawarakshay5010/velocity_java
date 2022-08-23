package Arrays;

public class example1
{
public static void main(String[] args) 
{
	
	
//  0   1  2
//0	10 20 30
//1	40 50 60	
	
	
	int [][] o1=new int [2][3];
	
	o1[0][0]=1000;
	o1[0][1]=2000;
	o1[0][2]=5000;
	o1[1][0]=4000;
	o1[1][1]=7000;
	o1[1][2]=6000;
	
	System.out.println(o1.length);             //array only shows row lenght 
	System.out.println(o1[1][2]);
	
	
	
	System.out.println("..........printing all..........");
	
	for(int i=0; i<=1; i++)           //for loop for row
	{
		
		for(int j=0; j<=2; j++)        //for loop for column     (nested for loop)
		
		{
			
			System.out.print(o1[i][j]+"    ");     // no println only print
			
		}
		
		System.out.println();
		
	}
	
	
	
	
	
}
}
