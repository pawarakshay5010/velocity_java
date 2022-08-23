package Arrays;

public class example2 
{
public static void main(String[] args) 
{
	
	String [][] a1= new String [3][3] ;
	
	a1[0][0]="akshay";
	a1[0][1]="rushikesh";
	a1[0][2]="shubham";
	a1[1][0]="jayesh";
	a1[1][1]="nikhil";
	a1[1][2]="pratik";
	
	
	System.out.println(a1.length);
	
	
	
	System.out.println(".....printing all........");
	
	
	
	for(int i=0; i<=2; i++)
	{

          for(int j=0; j<=2; j++)
          {
        	  
        	  
        	  System.out.print(a1[i][j]+"   ");
          }
          System.out.println();
		
		
		
	}
	
	
	
	
	
	
	
}
}
