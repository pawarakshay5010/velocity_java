package exception;

public class sample1 {
	 public static void main(String[] args) {
		
		 
		 
		int [] a=new int [5]; 
		 
		 
		 
//		System.out.println(a[6]);		 
		 
		 
		 
		 try
		 {
			 System.out.println(a[6]);	
			
		 }
		 
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			 
			 
			 System.out.println(e+"handled");
		 }
		 
		 
		 
		 
		 
		 
		 
	}

}
