package collection;

import java.util.HashSet;


public class a1_hashset 
{
	public static void main(String[] args) 
	{

		
		
		HashSet p=new HashSet();
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
		
		
		
		System.out.println(p);        //order of insertion: random
		                              //does not allow duplicate value
		                              //only allows one null value
		                              //best choise: to remove duplicate values when order of insertion is not mandotary

	
	p.add(555555);
	System.out.println(p);  
	
	
	System.out.println(p.size());
	System.out.println(p);  
	
	System.out.println("..............for loop........");
	
	
	
	for(Object d:p)
	
	{
		
		System.out.println(d);
	}
	
	
	
	
	
	
	
	}}
