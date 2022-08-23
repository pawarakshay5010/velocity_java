package collection;

import java.util.TreeSet;

public class b2_treeset
{
public static void main(String[] args) 
{

	TreeSet<String> t=new TreeSet<String>();    
	
	t.add("jayesh");                             
	t.add("nikhil sir");
	t.add("shubham");
	t.add("akshay");
	t.add("rushi");
	t.add("pratik");
	
	
	System.out.println(t.size());
	
	System.out.println(t);
	
	
	System.out.println("........for loop......");
	
	
	for(String k:t)
	
	{
		
		System.out.println(k);
	}
	
	
	
	
	
}
}
