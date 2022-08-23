package Arrays;


public class sample5
{
public static void main(String[] args)                        
{
	
	char [] o1=new char[5];
	o1[0]='A';
	o1[1]='B';
	o1[2]='C';
	o1[3]='D';
	o1[4]='E';
	
	
	System.out.println(o1.length);
	
	System.out.println(o1[3]);
	
	System.out.println("...........char array in decending order...");
	
	for(int i=4; i>=0;i--)
	{
		
		System.out.println(o1[i]);
		
	}
	
	System.out.println("...........char array in acending  order...");

 for (int i = 0; i<=4; i++)
 {
System.out.println(o1[i]);
	
}
	
	
	
}

}
