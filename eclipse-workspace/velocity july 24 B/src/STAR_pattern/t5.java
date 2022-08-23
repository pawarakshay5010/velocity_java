package STAR_pattern;

import java.util.Iterator;

public class t5
{
public static void main(String[] args)
{

	
	//     *
	//   **
	// ****
	//******
	
	
	int space=5;
	int star=1;
	
	
for (int i =1; i <=4; i++)
{

	for (int j = 1; j <=space; j++) 
	{
	
		
		System.out.print(" ");
	}
	
	for (int j = 1; j <=star; j++) 
	{
	
		System.out.print("*");
	}
	
	System.out.println();
	star=star+2;
	space=space-2;
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
