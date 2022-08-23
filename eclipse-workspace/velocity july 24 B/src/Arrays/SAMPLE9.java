package Arrays;

import java.util.Arrays;

public class SAMPLE9 
{
public static void main(String[] args) 
{
	
	String [] e= {"AKSHAY", "RUSHIKESH","JAYESH","NIKHIL","SHUBHAM"};
	
	
	System.out.println(e[0]);
	
	System.out.println(".......printing all names as above.....");
	
	for (int i = 0; i < e.length; i++) 
	{
		System.out.println(e[i]);	
	}
	
	{
		
		System.out.println(".......printing all names in  decending order");
	}
	
	for (int i = 4; i >=0; i--) 
	{
		System.out.println(e[i]);
	}	


	{	
		System.out.println(".......printing all names in alphabetical order...............");
	}
	
	Arrays.sort(e);
	
	for (int i = 0; i < e.length; i++)
	{
		System.out.println(e[i]);
	}
}
}
