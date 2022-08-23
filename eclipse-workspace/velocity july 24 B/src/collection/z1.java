package collection;

import java.util.ArrayList;
import java.util.Iterator;


public class z1
{
public static void main(String[] args) {
	
	
	
	ArrayList a= new ArrayList();
	
	a.add("akshay");
	
	
	a.add('A');
	
	a.add(10111);
	
	a.add('A');
	a.add('A');
	a.add('A');
	a.add('A');
	a.add('A');
	
	
	System.out.println(a);
	
	a.remove(2);
	
	
	
	System.out.println(a);
	
	
   System.out.println("......................");

//	
//	Iterator i = a.iterator();
//	
//	
//	while(i.hasNext())
//	{
//		
//		System.out.println(i.next());
//	}
	
	for(Object values:a)
	{
		
		System.out.println(values);
		
	}
	
	
}
}
