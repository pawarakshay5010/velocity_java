package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class sample1_arraylist
{
public static void main(String[] args) {
	
	
	
	ArrayList a = new ArrayList();
	
	
	a.add("akshay");
	a.add("nikhil");
	a.add('A');
	a.add(1011);
	a.add("akshay");
	a.add("nikhil");
	a.add('A');
	a.add(1011);
	a.add("akshay");
	a.add("nikhil");
	a.add('A');
	a.add(1011);
	a.add("akshay");
	a.add("nikhil");
	a.add('A');
	a.add(1011);
	
	
//	Iterator store = a.iterator();
//	
//	while(store.hasNext())
//	{
//		
//		System.out.println(store.next());
//	}
	
	for(Object storeinfo:a)
	{
		
		System.out.println(storeinfo);
	}
	
	
	
	
	
	
	
	
}
}
