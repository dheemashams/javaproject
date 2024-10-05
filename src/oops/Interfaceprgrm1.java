package oops;
interface Tvremote
{
	public void Channeldetails();
	public void Volumedetails();
}
interface SmartTVremote extends Tvremote
{
	public void Appsdetails();
    public void Wifidetails();
}

class Tv implements SmartTVremote
{

	@Override
	public void Appsdetails() {
		System.out.println("Youtube and Netflix");
		
	}

	@Override
	public void Wifidetails() {
		System.out.println("Setting to save the userid and passcode");
		
	}

	@Override
	public void Channeldetails() {
		System.out.println("Channels are displayed");
		
	}

	@Override
	public void Volumedetails() {
		System.out.println("Volume increase and decrease");
		
	}
	
}
public class Interfaceprgrm1 {

	public static void main(String[] args) {
		
		Tv s=new Tv();
		s.Channeldetails();
		s.Appsdetails();
		s.Volumedetails();
		s.Wifidetails();
		
		

	}

}
