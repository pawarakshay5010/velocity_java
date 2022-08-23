package practice___________________;

public class gen_dell implements gen_1
{
	public void memory()
	{
		
		System.out.println("2TB");
	}
	
	
	
	public void ram()
	{
		
		System.out.println("16gb");
	}
	
	
	
	public void processor()
	{
		
		System.out.println("intel core i7");
	}
	
	
	
	public static void main(String[] args)
	{
	
		
		gen_dell d=new gen_dell();
		d.memory();
		d.processor();
		d.ram();
		
		System.out.println("............................................");
		
		gen_hp p=new gen_hp();
		p.memory();
		p.ram();
		p.processor();
		System.out.println("............................................");
		
		
		gen_lenevo k=new  gen_lenevo();
		k.ram();
		k.memory();
		k.processor();
	}
	
	
}
