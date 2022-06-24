package logical_programe;

public class count_numberof_characters 
{
public static void main(String[] args) {
	
	
	
	String a="aaaaaaaaaaaaaaaaaaaaaaaaabcaaisjjaaasrdfsfk";
	
	String b="";
	
	int total = a.length();
	
	
	 int m = a.replaceAll("[a]", "").length();
	
	System.out.println("count of a:"+(total-m));
	
	
	
//	String a="aaaaaaaaaaaaaaaaaaaaaaaaabcaaisjjaaasrdfsfk";
//	
//	int total = a.length();
//	
//	
//	
// int aa = a.replaceAll("[b-z]", "").length();
//	
//	
//	System.out.println(aa);
//	
}	
}
