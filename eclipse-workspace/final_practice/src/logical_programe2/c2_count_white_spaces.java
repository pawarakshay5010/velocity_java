package logical_programe2;

public class c2_count_white_spaces 
{
public static void main(String[] args) {
	
	
	
	
	String a="aaks wedk  erf        wergf  wergt           wrgt  w               ttttttttttttt g";
	
	int count = 0;
	
	for(int i=0; i<=a.length()-1; i++)
	{
		
		
		char cc = a.charAt(i);
		
		
		if(cc==' ')
		{
			
			count++;
			
		}
		
		
		
	}
	
	
	System.out.println(count);
	
	
	
	
	
}
}
