package logical_programe;

import java.util.HashMap;
import java.util.Set;

public class count_repeated_characters3 
{
public static void main(String[] args) {
	
	
	String a="abcccccccccccccccdssssssssssssssssssssjj";
	
	
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
	}
	
	Set<Character> s = h.keySet();
	
	for(Character kk:s)
	{
		
		{
		
		System.out.println(kk+":"+h.get(kk));
		
		}}
	
	
	
	
	
	
	
}
}
