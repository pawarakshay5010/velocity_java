package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class demo2 
{
public static void main(String[] args)
{

	
	ArrayList w=new ArrayList(11);
	w.add("akshay");
	w.add(1011);
	w.add('A');
	w.add('B');
	w.add("velcocity training centre");
	w.add("software testing course");
	w.add("java course");
	w.add("data science course");
	w.add("RPA course");
	w.add(40000);
	w.add("3 months");
	w.add(1011);
	w.add(null);
	w.add(null);

	w.add(6, "fees");
	
	System.out.println(w);
	
	w.remove(6);
	
	System.out.println(w);
	
	w.add(5, "fees");
	System.out.println(w);
	
	
	System.out.println(w.size());
	w.set(1,22222);
	
	System.out.println(".............");
	
	
	
	Iterator it = w.iterator();
	
	while(it.hasNext())
	{
		
		System.out.println(it.next());
	}
	
	
	
	
	
	
	
	
	
}
}
