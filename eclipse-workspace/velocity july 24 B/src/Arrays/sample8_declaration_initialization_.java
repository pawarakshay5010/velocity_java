package Arrays;

import java.util.Arrays;

public class sample8_declaration_initialization_ 
{
public static void main(String[] args) 
{
	
	int [] o2={500,300,100,400,200};    //declaration_initialization in same step
	
	System.out.println(o2[3]);

	System.out.println(o2.length);
	
	
	System.out.println("........printing array.........");
	
	
	for (int i = 0; i < o2.length; i++)                //printing as it is
	{
		System.out.println(o2[i]);
		
	}
	
	System.out.println("........printing array in acending order.........");
	
Arrays.sort(o2);     
	
for (int i = 0; i < o2.length; i++)                             //acending order
{
	System.out.println(o2[i]);
	
}

System.out.println("........printing array in decending  order.........");


for (int i =4; i >= 0; i--)                                        //decending order
{
	System.out.println(o2[i]);
	
}



}
}
