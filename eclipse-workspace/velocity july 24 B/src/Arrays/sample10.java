package Arrays;

import java.util.Arrays;

public class sample10 
{
public static void main(String[] args) 
{
	
	
	char [] p1= {'C','B','A','D','F','E'};
	
	
	
	System.out.println(p1.length);
	
	for(int i=0; i<=5; i++)                //printing as it is
	{
		System.out.println(p1[i]);
		
	}
	
	{
		System.out.println("...........acending order......");
		
	}
	Arrays.sort(p1);
	for (int i = 0; i < p1.length; i++)
	{
		
		System.out.println(p1[i]);
	}
	
	{
		System.out.println("...........decending  order......");
		
	}
	Arrays.sort(p1);
	for (int i = 5; i >=0 ; i--)
	{
		
		System.out.println(p1[i]);
	}
	
	
	
}
}
