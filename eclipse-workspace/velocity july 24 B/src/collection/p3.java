package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class p3
{
public static void main(String[] args)
{

	
	LinkedList<String> l=new LinkedList<String>();
	
	
	l.add("jayesh");
	l.add("shubham");
	l.add("akshay");
	l.add("nikhil sir");
	l.add("rushi");
	l.add("pratik");
	l.add("himanshu sir");
	
	System.out.println(l.size());
	
	
	System.out.println(l.contains("akshay"));
	
	
	System.out.println(l.indexOf("pratik"));
	
	System.out.println(l);
	
	
	l.add(2, null);
	l.add(3, null);
	
	System.out.println(".........iterator........");
	
	
	ListIterator h=l.listIterator();
	
	
	while(h.hasNext())
	{
		System.out.println(h.next());
	}
	
	
	
	
	
	
	
	
}
}
