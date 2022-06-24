package logical_programe;

import java.util.HashMap;
import java.util.Set;

public class count_repeated_characters2
{
public static void main(String[] args) {
	
	
	
	
	String aa="aaaaaaaaaaaaaaaabccccccccdddddddddddddddddddddddddddd";
	
	
	HashMap<Character, Integer> h= new HashMap<Character, Integer>();
	
	for(int i=0; i<=aa.length()-1; i++)
	{
		
		char c = aa.charAt(i);
		
		if(h.containsKey(c))
		{
			h.put(c, h.get(c)+1);
			
		}
		else
		{
			
		h.put(c, 1);
		}
		
	}
	
//	 Set<Character> key = h.keySet();
//	
//	for(Character kk:key)
//	{
//		
//		System.out.println(kk + ":" + h.get(kk));
//	}
	
	
	
	
	Set<Character> oo = h.keySet();
	
	for(Character qq:oo)
	{
		if(h.get(oo)>1) {
			
			System.out.println(oo + ":" + h.get(oo));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
}
