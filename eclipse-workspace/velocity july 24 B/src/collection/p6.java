package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class p6
{
public static void main(String[] args) 
{

	
	TreeSet<String> l=new TreeSet<String>();
	
	l.add("jayesh");
	l.add("shubham");
	l.add("akshay");
	l.add("nikhil sir");
	l.add("rushi");
	l.add("pratik");
	l.add("himanshu sir");
	
	System.out.println(l.size());
	
	
	System.out.println(l);
	
	
	System.out.println("..........decending.......");
	
	
	System.out.println(l.descendingSet());
	
	
	System.out.println("........iterator.......");
	
	
	
	Iterator<String> k = l.iterator();
	
	
	while(k.hasNext())
	{
		System.out.println(k.next());
	}
	
	
	
	
}
}
