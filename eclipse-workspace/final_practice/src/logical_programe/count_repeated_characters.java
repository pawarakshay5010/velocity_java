package logical_programe;

import java.util.HashMap;
import java.util.Set;

public class count_repeated_characters 
{
public static void main(String[] args) {
	
	
	
	String a="abccdeeefggggg";
	
	
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();
		
		
	for(int i=0; i<=a.length()-1; i++)
	{
		
		char ss = a.charAt(i);
		
		if(h.containsKey(ss))
		{
			
			h.put(ss, h.get(ss)+1);
		}
		else
		{
			
			h.put(ss, 1);
		}
		
	}
	
	Set<Character> k = h.keySet();
	
	for(Character gg:k)
	{
		
		System.out.println(gg +":"+h.get(gg));
	}
	
	
	
	
	
	
}
}
