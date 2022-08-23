package collection;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class p5 
{

public static void main(String[] args) 
{

	
	LinkedHashSet l=new LinkedHashSet();
	

	l.add("jayesh");
	l.add("shubham");
	l.add("akshay");
	l.add("nikhil sir");
	l.add("rushi");
	l.add("pratik");
	l.add("himanshu sir");
	
	System.out.println(l.size());
	
	
	System.out.println(l);
	

//	System.out.println(".........iterator........");
	
	
//	Iterator j = l.iterator();
//	
//	while(j.hasNext())
//	{
//		System.out.println(j.next());
//	}
	
	
	System.out.println(".........for each.......");
	
	
	for(Object f:l)
	{
		System.out.println(f);
	}
	
	
	
	
}

}
