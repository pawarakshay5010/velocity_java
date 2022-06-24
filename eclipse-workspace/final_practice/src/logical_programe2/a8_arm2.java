package logical_programe2;

public class a8_arm2
{
public static void main(String[] args) {
	
	
	
int a=153;

int x=0;

for(int i=a; i>0; i=i/10)
{
	
int b=i%10;

x=x+(b*b*b);

}
	
	
System.out.println(x);
	
	
	
}
}
