package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class sample3_linkedlist 
{
	public static void main(String[] args) 
	{

		
		
		LinkedList p=new LinkedList();
		p.add("akshay");
		p.add(100);
		p.add(200);
		p.add(300);
		p.add(400);
		p.add(null);
		p.add(500);
		p.add(600);
		p.add(700);
		p.add(null);
		p.add(null);
		p.add(100);                              
		
		
		System.out.println(p);
		
		
		System.out.println(p.contains(100));
		
		p.add(5, 22222);                       //in linkedlist right/left shift operation desen't perform  only pointer changes
		
		System.out.println(p);
		
		
		p.remove(10);
		System.out.println(p);
		
		
		p.set(1, 11);
		
		System.out.println(p);
		
		System.out.println("..............iterator....");
		
		
		Iterator ii = p.iterator();
		
		
		while(ii.hasNext())
		{
			
			Object g = ii.next();
			System.out.println(g);
		}
		
		
		
		
		
		
		
		System.out.println("...............");
		
		for(Object f1:p)
		{
			System.out.println(f1);
		}
		
		
		
		
		
		
		
		
		
		
}}
