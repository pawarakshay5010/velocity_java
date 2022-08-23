package interface_implementation;

public interface sample1     // to declare 100% incomplete methods we use interface
{

	int a=10;    // final or static int a=10;      
	
	
	void m1();         //abstract public void m1();	
	void m2();           //abstract public void m2();	
	 
	
	
	
}
                                         //features of interface: 1) we cannot create object of interface
                                               //                 2)but we can create object of interface by using 'implementation class' with help of "implements" keyword 
                                             //                   3)constructor concept cannot be used in interface
                                          //                      4)we can use multiple inheritance in interface
                                           //                     5)methods declared in interface are by default public and abstract
                                         //                       6)variable declared in interface are static and final
