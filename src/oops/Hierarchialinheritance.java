package oops;
class Vehicles1
{
	public void vehiclemthd()
	{
		System.out.println("Vehiclemthd");
	}
}
class Car1 extends Vehicles1
{
	public void carmthd()
	{
		int s=4;
		System.out.println("Car wheels number="+s);
	}
}
class Truck1 extends Vehicles1
{
	public void truckmthd()
	{
		int s1=12;
		System.out.println("Truck wheels numbers="+s1);
	}
}
public class Hierarchialinheritance {
	public static void main(String[] args) {
		Truck1 ob=new Truck1();
		Car1 ob1=new Car1();
		ob.vehiclemthd();
		ob.truckmthd();
		ob1.carmthd();

	}

}
