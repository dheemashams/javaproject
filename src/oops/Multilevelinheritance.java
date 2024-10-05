package oops;
class Vehicles
{
	public void vehiclemthd()
	{
		System.out.println("Vehiclemthd");
	}
}
class Car extends Vehicles
{
	public void carmthd()
	{
		int s=4;
		System.out.println("Car wheels number="+s);
	}
}
class Truck extends Car
{
	public void truckmthd()
	{
		int s1=12;
		System.out.println("Truck wheels numbers="+s1);
	}
}


public class Multilevelinheritance {

	public static void main(String[] args) {
		Truck ob=new Truck();
		ob.vehiclemthd();
		ob.carmthd();
		ob.truckmthd();
				

	}

}
