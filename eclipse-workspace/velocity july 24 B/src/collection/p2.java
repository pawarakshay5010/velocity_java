package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class p2 
{

	public static void main(String[] args)
	{
	
		
		
		Vector a=new Vector();
		
	a.add("akshay");
	a.add(10);
	a.add(20);
	a.add(3000);
	a.add(400);
	a.add(800);
	a.add(100);
		
		
		System.out.println(a.size());
		
		System.out.println(a);
		
		System.out.println(".......iterator.........");
		
		
		Iterator v = a.iterator();
		
		while(v.hasNext())
		{
			
			System.out.println(v.next());
		}
		
		System.out.println("......for each.........");
		
		
		for(Object q1:a)
		
		{
			System.out.println(q1);
		}
		
		
		
		
		
		
		
		
		
}
}