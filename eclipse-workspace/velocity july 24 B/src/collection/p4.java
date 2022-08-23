package collection;

import java.util.HashSet;
import java.util.Iterator;

public class p4 
{
public static void main(String[] args) 
{

	
	HashSet l=new HashSet();
	

	l.add("jayesh");
	l.add("shubham");
	l.add("akshay");
	l.add("nikhil sir");
	l.add("rushi");
	l.add("pratik");
	l.add("himanshu sir");
	
	System.out.println(l.size());
	
	
	System.out.println(l);
	

	System.out.println(".........iterator........");
	
	
	Iterator j = l.iterator();
	
	while(j.hasNext())
	{
		System.out.println(j.next());
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
