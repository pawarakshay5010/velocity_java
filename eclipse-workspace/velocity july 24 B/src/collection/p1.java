package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class p1 
{

	public static void main(String[] args)
	{
	
		
		
		ArrayList a=new ArrayList();
		
	a.add("akshay");
	a.add(10);
	a.add(20);
	a.add(3000);
	a.add(400);
	a.add(800);
	a.add(100);
		
		
		System.out.println(a.size());
		
		a.set(5, 888);
		
		System.out.println(a);
		
		
		
		System.out.println(".......iterator.........");
		
		Iterator i = a.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		
		
	}
}
