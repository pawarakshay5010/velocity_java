package generalization;

public class sample3_IPHONE implements sample1_MOBILE
{

	public void camera()
	{
		
		System.out.println("camera: 64mp");
	}
	
	
	public void battery()
	{
		
		System.out.println("battery: 4000mAh");
	}
	
	
	public void storage()
	{
		
		System.out.println("stogare: 256gb");
	}
	
	public void ram()
	{
		
		System.out.println("ram: 8gb");
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		
		System.out.println("....SAMSUNG...........");
		
		
		sample2_SAMSUNG s=new sample2_SAMSUNG();
		s.camera();
		s.battery();
		s.storage();
		s.ram();
		
		System.out.println("....IPHONE...........");
		
		sample3_IPHONE i=new sample3_IPHONE();
		i.camera();
		i.battery();
		i.ram();
		i.storage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
