package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class sample1
{
public static void main(String[] args) {
	
	
	ArrayList m=new ArrayList();
    m.add(100);
    m.add("akshay");
    m.add(500);
    m.add("akshay");
	
	System.out.println(m.size());
	
	System.out.println(m);
	
System.out.println(m.set(2, 590000000));
	
	System.out.println("..........iterator");
	
	
	Iterator kk = m.iterator();
	
	for(Object o1:m)
	
	{
		
		System.out.println(o1);
		
	}
	
	
	
	
	
	
	
}
}
