package logical_programe;

public class count_numberof_characters2 
{
public static void main(String[] args) {
	
	
	
	
	String a="abbbbbbbbbbbbbbbbbccdd";
	
	
	int total = a.length();
	System.out.println(total);
	
	System.out.println("..........................................");
	 int b = a.replaceAll("[b]", "").length();
	
	
	System.out.println("count of b:"+(total-b));
	
	
	
	
	
	
	
	
}
}
