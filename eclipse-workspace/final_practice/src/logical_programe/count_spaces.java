package logical_programe;

public class count_spaces
{
public static void main(String[] args) {
	
	
	
	String a="akshay is a ve  ry goo  boy  ";
	
	
	int  b=0;
	
	
	for(int i=0; i<=a.length()-1; i++)
	{
		
		char s = a.charAt(i);
		
		if(s==' ')
		{
			
			b++;
		}
		
	}
	System.out.println(b);
	
System.out.println("...................................");	




String q="akshay us vetu goof               biy";


int n=0;


for(int i=0; i<=q.length()-1; i++)
{
	
char sp = q.charAt(i);


if(sp==' ')
{
	
n++;


}



}

System.out.println(n);












	
}
}
