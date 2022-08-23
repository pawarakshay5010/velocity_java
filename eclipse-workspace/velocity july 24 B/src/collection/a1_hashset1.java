package collection;

import java.util.HashSet;
import java.util.Iterator;

public class a1_hashset1
{
public static void main(String[] args) 
{

	
	HashSet h=new HashSet();
	
	h.add("velocity");
	h.add("subject");
	h.add(30000);
	h.add(40000);
	h.add(50000);
	h.add(60000);
	h.add("software testing");

	
	
	System.out.println(h.size());
	
	System.out.println(h);
	
	System.out.println(h.isEmpty());
	
	System.out.println(".......iterator.....");
	
	Iterator q = h.iterator();
	
//	for(int i=0; i<=h.size()-1;i++)           //using for loop
//	
//	{
//		
//		System.out.println(q.next());
//	}
//	
//	
	System.out.println(".......while loop.....");
//	
	
	while(q.hasNext())         //hasNext only checks the data
	
	{
		System.out.println(q.next());        //to get all data next is used
		
	}
	
	
	
}
}
