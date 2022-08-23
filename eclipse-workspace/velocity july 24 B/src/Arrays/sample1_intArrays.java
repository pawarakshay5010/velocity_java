
package Arrays;

public class sample1_intArrays
{

	public static void main(String[] args) 
	{
		
		
		int [] o1=new int[5];       //array declaration
		
		o1[0]=100;               //array initialization
		o1[1]=200;
		o1[2]=300;
		o1[3]=400;
		o1[4]=500;
		
		System.out.println(o1.length);
		System.out.println(o1[3]);
		//System.out.println(o1[6]);  ==> array index out of the bounds expection
		
	
	
	
		System.out.println("...........print int array info....");

	
	
	 
	for(int i=0; i<=4; i++)                            //     for(int i=0; i<=o1.length-1; i++)
	                                                  //      {		         //4
		                                                          //System.out.println(ar[i]);                            //300  100 200 500 400
	
	{
		 
		System.out.println(o1[i]);
	}
	
	
	
	
	
}	
	
}
