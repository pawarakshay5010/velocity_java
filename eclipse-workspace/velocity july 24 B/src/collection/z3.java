package collection;

import java.util.TreeSet;

public class z3
{
public static void main(String[] args) {
	
	
	
	TreeSet t =new TreeSet();
	
	t.add(30);
	t.add(50);
	t.add(40);
	t.add(10);
	t.add(100);
	t.add(20);
	t.add(70);
	t.add(60);
  // t.add(null);        //if null value is passed then it will show null pointer exception
	t.add(100);
	t.add(100);
	t.add(100);
	t.add(100);
	
	
	
	System.out.println(t);
	
	
	
	for(Object yyy:t)
	
	
	{
		
		System.out.println(yyy);
	}
	
	
	
	
	
	
}
}
