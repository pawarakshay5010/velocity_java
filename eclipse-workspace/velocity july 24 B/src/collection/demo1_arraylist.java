package collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class demo1_arraylist 
{
public static void main(String[] args)
{

ArrayList p=new ArrayList(20);     // if we dont mention any datatype then we can pass any data type in that
	
	
	// ArrayList<String> a=new ArrayList<String>();          //if we put any data type in angular braces then it will not accept other data type
	


	
	p.add("AKSHAY");

	p.add(500);
	
	p.add('A');
	
	p.add(500);
	
	p.add(500);
	
	p.add(500);
	
	p.add(500);
	
	
	
	p.add(500);
	
	p.add(500);
	
	p.add(500);
	
	
	
	
	System.out.println(p);
	

	


	
	
	System.out.println(p.isEmpty());
	
	System.out.println(p.contains('A'));
p.add(4,999);
	
	
System.out.println(p);
	
	
	p.add(4, 144441);
	
	
	System.out.println(p);
	
	
	
}
}
