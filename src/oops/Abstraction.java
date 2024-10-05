package oops;
abstract class Jeep
{
	abstract public void Acceleration();
	public void Speed()
	{
		System.out.println("High in power");}
}
class Thar extends Jeep
{

	@Override
	public void Acceleration() {
		System.out.println("Thar acceleration mode");
		
	}
	
}
class Jimni extends Jeep
{

	@Override
	public void Acceleration() {
		System.out.println("Jimni acceleration mode");	
		
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
		Thar ob=new Thar();
		ob.Acceleration();
		ob.Speed();
		Jimni ob1=new Jimni();
		ob1.Acceleration();
		ob1.Speed();

	}

}
