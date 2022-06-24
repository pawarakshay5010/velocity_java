package arrays;

import java.util.Arrays;

public class sample1
{
public static void main(String[] args) {
	
	
	
	
	int a[] = new int[5];
	
	a[0]=100;
	a[1]=200;
	a[2]=500;
	a[3]=300;
	a[4]=400;
	
	System.out.println(a.length);
	
	System.out.println(a[3]);
	
	
	System.out.println(".................................");
	
	Arrays.sort(a);
	for(int i=0; i<=4; i++)
	{
		
		System.out.println(a[i]);
	}
	
	
	
	
	
}
}
