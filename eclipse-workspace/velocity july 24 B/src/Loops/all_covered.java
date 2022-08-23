package Loops;

public class all_covered
{
public static void main(String[] args)
{
	
	//for loop  - to print even no upto 20
	
	
	for(int i=2; i<=20; i=i+2)       //(starting condition ; end condition ; increment/decrement)
	{
		
		System.out.println(i);
	}
	
	System.out.println(".......................................");
	
	
	
	//while loop - to print no from 30 to 40 
	
	
	int j=30;
	
	
	while(j<=40)
	{
		System.out.println(j);
		
		j++;
		
	}
	
	System.out.println(".......................................");
	
	
	//do_while loop - to print no from 100 to 90
	
	int k=100;
	
	do 
	{
		System.out.println(k);
		k--;	
	}
	
	while(k>=90);
	
	
}
}
