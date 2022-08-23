package Inheritance;

public class b3 extends b2
{                                          //v1.3

	
	public void payment()
	{
		System.out.println("payment");
	}
	
	
	
	
	public static void main(String[] args)
	{
		
		
		b3 w=new b3();
		w.send_messege();
		w.send_pictures();
		w.send_pictures();
		w.audio_call();
		w.video_call();
		w.payment();
	}
	
	
	
	
	
	
}
