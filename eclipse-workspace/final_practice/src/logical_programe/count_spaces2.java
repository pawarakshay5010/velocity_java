package logical_programe;

public class count_spaces2
{
public static void main(String[] args) {
	
	
	
	String a="ak        sha                     ay";
	
	
	int spaces=0;
	
	for(int i=0; i<=a.length()-1; i++)
{
	
    char sp = a.charAt(i);
    
    if(sp==' ')
    {
    	
    	spaces++;
    	
    }
    
    

}
	
	
	System.out.println(spaces);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
