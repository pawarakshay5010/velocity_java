package Arrays;

import java.util.Arrays;

public class b1 
{
public static void main(String[] args) 
{

	
	int e []=new int [7];
	e[0]=4684;
	e[1]=5621;
	e[2]=845;
	e[3]=2204;
	e[4]=69844;
	e[5]=118;
	e[6]=45;
	
	System.out.println(e.length);
	
	System.out.println(e[5]);
	
	
	System.out.println("..........printing all..........");
	
	
	for(int i=0; i<=6; i++)
	
	{
		System.out.println(e[i]);
		
	}
	System.out.println("..........printing series wise..........");
	
	Arrays.sort(e);
	
	for(int k=0; k<=6; k++)
	{
		
		System.out.println(e[k]);
	}
	
	
}
}
