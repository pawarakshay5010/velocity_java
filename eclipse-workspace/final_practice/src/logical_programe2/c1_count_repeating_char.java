package logical_programe2;

import java.util.HashMap;
import java.util.Set;

public class c1_count_repeating_char
{
public static void main(String[] args) {
	
	
	String a ="abbbbddddddddccccccccccccccceeeeee";	
	
	
	HashMap<Character, Integer> h = new HashMap<Character, Integer>();
	
	
	for(int i=0; i<=a.length()-1; i++)
	{
		
		char cc = a.charAt(i);
		
		if(h.containsKey(cc))
		{
			
			h.put(cc, h.get(cc)+1);
			
		}
		
		else
		{
			
			h.put(cc, 1);
		}
		
		
		Set<Character> k = h.keySet();
		
		
		for(Character key:k)
		{
			
			System.out.println(key+":"+h.get(key));
		}
		
		
		
		
	}
	
	
}
}
