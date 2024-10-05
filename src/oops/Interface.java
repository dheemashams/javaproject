package oops;
interface Bike
{
	public void Bikedetails();
	public void Speedlimit();
	
}
class Enfield implements Bike
{

	@Override
	public void Bikedetails() {
	System.out.println("Nice body with shining");
		
	}

	@Override
	public void Speedlimit() {
		System.out.println("Speed with power");
	}
}
class Kawasaki implements Bike
{

	@Override
	public void Bikedetails() {
		System.out.println("Nice body with shining");
		
	}

	@Override
	public void Speedlimit() {
		System.out.println("Power in mode");
		
	}
	
}
public class Interface {

	public static void main(String[] args) {
		Enfield ob=new Enfield();
		ob.Bikedetails();
		ob.Speedlimit();
		Kawasaki o=new Kawasaki();
		o.Bikedetails();
		o.Speedlimit();
		

	}

}
