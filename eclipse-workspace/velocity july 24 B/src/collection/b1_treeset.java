package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class b1_treeset
{
public static void main(String[] args) 
{

	TreeSet t=new TreeSet();
	
	t.add(30);
	t.add(50);
	t.add(40);
	t.add(10);
	t.add(100);
	t.add(20);
	t.add(70);
	t.add(60);
//	t.add(null);
	//t.add(100);
	
	
	
	System.out.println(t.size());
	
	System.out.println(t);
	
	System.out.println("........decending........");
	
	System.out.println(t.descendingSet());
	
	
	System.out.println("........iterator.......");
	
	
	Iterator a1 = t.iterator();
	
	while(a1.hasNext())
	{
		System.out.println(a1.next());
	}
	
	System.out.println("........for each loop.............");
	
	for(Object e:t)
	
	{
		System.out.println(e);
	}
	
	
	
	
	
}
}
