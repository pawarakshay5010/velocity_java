package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class demo5__listiterator 
{
	public static void main(String[] args) 
	{

		
		ArrayList k=new ArrayList();
		
		k.add("akshay pawar");
		k.add(11);
		k.add('A');
		k.add("velocity training centre");
		k.add("course applied: software testing");
		k.add("batch started: 24 july");
		k.add("course duration 3 months");
		k.add("fees: 40000");
		k.add(5000000);
	    k.add("100% placement");
		
		System.out.println(k);
		
		k.add(4, "branch: katraj");
		
		
		
		System.out.println(k.size());
		
		k.remove(1);
		
		System.out.println(k);
		
		k.set(8, 555555555);
		
		System.out.println(k);
		
		System.out.println("...........ListIterator...........");
		
		
		
		
	ListIterator w = k.listIterator();
		
		for(int i=0; i<=k.size()-1;i++)         //using for loop
		
		{
			System.out.println(k.get(i));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
}
}