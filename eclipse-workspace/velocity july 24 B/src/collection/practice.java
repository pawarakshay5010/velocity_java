package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class practice 
{
public static void main(String[] args)
{

	
	LinkedList g=new LinkedList();
	
g.add("jayesh");
g.add(11);
g.add(90.5f);
g.add("software testing");
g.add(null);
g.add(null);
g.add(11);

	
	System.out.println(g.size());
	
	System.out.println(g.contains(11));
	System.out.println(g);
	
	
	g.set(2, 95);
	
	System.out.println(g);
	
	g.add(4, "nikhil sir");
	
	System.out.println(g);
	
	System.out.println("..........iterator.......");
	
	//Iterator r = g.iterator();
	
//	while(r.hasNext())
//	
//	{
//		System.out.println(r.next());
//	}
//	
//	
	for(int i=0; i<=g.size()-1;i++)
	
	{
		
		System.out.println(g.get(i));
	}

//	for(Object p:g)
//	
//	{
//		System.out.println(p);
//		
//	}
//	
}
}
