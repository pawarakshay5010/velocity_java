package Arrays;

import java.util.Arrays;

public class sample7
{
public static void main(String[] args) 
{
	
	
	String [] ar1=new String [4];
	
	ar1[0]="AKSHAY";
	ar1[1]="NIKHIL";
	ar1[2]="RAHUL";			
	ar1[3]="GIRISH";
	
	
	Arrays.sort(ar1);            
	
	System.out.println(".......print names in acending order........");
	
	for(int i=0; i<=3; i++)
	{
		System.out.println(ar1[i]);
	}
	
	
	Arrays.sort(ar1);
	
	System.out.println(".......print names in decending order........");
	
	
	for (int i= 3; i>=0; i--) 
		{
			System.out.println(ar1[i]);
		}
		
	
	
	
}
}
