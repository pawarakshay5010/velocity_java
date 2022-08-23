package Arrays;

public class a1
{
public static void main(String[] args)
{
	
	int [][] q=new int [3][3];
	
	q[0][0]=11;
	q[0][1]=12;
	q[0][2]=13;
	q[1][0]=14;
	q[1][1]=15;
	q[1][2]=16;
	q[2][0]=17;
	q[2][1]=18;
	q[2][2]=19;
	
	
	System.out.println(q.length);
	
	System.out.println(q[1][1]);
	
	
	
	System.out.println(".........printing all...........");
	
	
	for(int i=0; i<=2; i++)
	{
		
		for (int j = 0; j <=2; j++) 
		{
	System.out.print(q[i][j]+"  ");
			
		}
		
		System.out.println();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
