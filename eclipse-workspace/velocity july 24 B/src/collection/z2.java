package collection;

import java.util.HashSet;
import java.util.Iterator;

public class z2 
{
public static void main(String[] args) {
	
	
	
	
	HashSet t =new HashSet();
	
	t.add(30);
	t.add(50);
	t.add(40);
	t.add(10);
	t.add(100);
	t.add(20);
	t.add(70);
	t.add(60);
   t.add(null);
	t.add(100);
	t.add(100);
	t.add(100);
	t.add(100);
	
	
	
	System.out.println(t);
	
	
	
	Iterator i = t.iterator();
	
	
	while(i.hasNext())
	{
		
		System.out.println(i.next());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
