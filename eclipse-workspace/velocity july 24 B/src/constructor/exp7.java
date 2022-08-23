package constructor;

public class exp7 
{

	
	String carname;
	int carprice;
	float carsales2021;
	char carclass;
	
	
	
	
	
	
	
	exp7(String cname, int cprice, float csales2020, char cclass)
	{
		carname=cname;
		carprice=cprice;
		carsales2021=csales2020;
		carclass=cclass;
		
	}
	
	public void carINFO()
	{
		System.out.println("carmodel:"+carname);
		System.out.println("price:"+carprice);
		System.out.println("sales percentage in 2021:"+carsales2021);
		System.out.println("class:"+carclass);
		
	}
	
	
	
}
