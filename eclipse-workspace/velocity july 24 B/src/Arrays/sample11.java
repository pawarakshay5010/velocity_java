package Arrays;

import java.util.Arrays;

public class sample11 
{
public static void main(String[] args) 
{
	
	
	int [] e= {3,2,8,6,4,1,9,10,5,7};
	
	
	
	System.out.println(e.length);
	System.out.println(e[0]);
	
	
	System.out.println("...........printing series wise.......");
	
	Arrays.sort(e);
	for(int i=0; i<=9; i++)
	{
		
		
		System.out.println(e[i]);
	}
	
	System.out.println("...........printing reverse no.......");
	
	Arrays.sort(e);
	for(int i=9; i>=0; i--)
	{
		
		
		System.out.println(e[i]);
	}
	
}
}
