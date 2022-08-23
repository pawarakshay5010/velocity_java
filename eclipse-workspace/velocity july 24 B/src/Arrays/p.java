package Arrays;

import java.util.Arrays;

public class p 
{
public static void main(String[] args)
{

	
	
	int a[]= {1,2,8,6,4,3,7,5,3,4,5};
	
	
	System.out.println(a.length);
	
	
	System.out.println(a[2]);
	
	
	System.out.println(".....................");
	
	
	for(int i=0; i<=a.length-1; i++)
	{
		
		
		
		System.out.println(a[i]);
	}
	
	
	System.out.println(".....................");

	
	Arrays.sort(a);
	
	
	for(int i=a.length-1; i>=0; i--)
	{
		
		
		
		System.out.println(a[i]);
	}
	
	
	
	
}
}
