package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class a2_linkedset 
{
	public static void main(String[] args) 
	{

		
		
		LinkedHashSet p=new LinkedHashSet();
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
		
		                                   //best choise: to remove duplicate values when order of insertion is  mandatory
		
		System.out.println(p);
		
		
		System.out.println("......iterator.......");
		
		Iterator w1 = p.iterator();
		
		while(w1.hasNext())
		{
			System.out.println(w1.next());
		}
		
		
}}
