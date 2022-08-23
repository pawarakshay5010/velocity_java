package collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class demo7 
{
public static void main(String[] args) 
{
	
	
	Vector v=new Vector();
v.add("akshay");
v.add("rushikesh");
v.add("jayesh");
v.add("shubham");
v.add("nikhil")	;
v.add(100);
v.add(200);
v.add(500);
	
	
	System.out.println(v);
	
	System.out.println(v.size());
	
	System.out.println(v.set(5, 1000000000));
	
	v.add(5, 50);
	System.out.println(v);
	
	System.out.println("..........................");
            Iterator i = v.iterator();
v.add(5, 50);
System.out.println(v);
	
	for(Object b:v)
	
	{
		
		System.out.println(b);
	}
	
	
	
	
	
	
}
}
 