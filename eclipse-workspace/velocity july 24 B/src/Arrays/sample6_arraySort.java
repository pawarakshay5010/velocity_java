package Arrays;

import java.util.Arrays;

public class sample6_arraySort
{
public static void main(String[] args) 
{
	
	int [] ar=new int [5];
	
	ar[0]=50;
	ar[1]=30;
	ar[2]=10;
	ar[3]=20;
	ar[4]=40;
	
	System.out.println(".................print array info in acending order..........");
	
	Arrays.sort(ar);              //arrays.sort - to print array info in ascending or decending order
	
	
	for(int i=0; i<=4; i++)                  //acending order
	{
		System.out.println(ar[i]);
		
	}
	
	System.out.println(".................print array info in decending order..........");
	
	
	Arrays.sort(ar);
	for (int i = 4; i >= 0; i--)         //decending order
	{
		System.out.println(ar[i]);
		
	}

	
	
}

}
