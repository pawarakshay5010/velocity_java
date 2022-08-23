package collection;

import java.util.ListIterator;
import java.util.Vector;

public class sample2
{
public static void main(String[] args) 
{

	
	
	Vector p=new Vector();
	p.add("akshay");
	p.add(100);
	p.add(200);
	p.add(300);
	p.add(400);
	p.add(null);
	p.add(500);
	p.add(600);
	p.add(700);
	
	
	System.out.println(p.capacity());
	
	System.out.println(p.size());
	
	System.out.println(p.contains(600));
	
	
	System.out.println(p);
	
	p.remove(8);
	System.out.println(p);
	
	p.add(5, 111111111);
	
	System.out.println(p);
	System.out.println(p.size());
	
	
	System.out.println("..........");
	
	
	ListIterator n = p.listIterator();
	
	for(Object fe:p)
	{
		System.out.println(fe);
		
	}
	
	
}
}
