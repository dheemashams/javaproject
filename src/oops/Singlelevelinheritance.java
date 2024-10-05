package oops;
class Pets
{
	String l="Cats";
	public void Petsmthd()
	{
		System.out.println("Pets are:"+l);
	}
}
class Dog extends Pets
{
	String v="Dogs";
	public void Dogmthd()
	{
		System.out.println("Also have:"+v);
	}
}
public class Singlelevelinheritance {

	public static void main(String[] args) {
		Dog ob=new Dog();
	    ob.Petsmthd();
		ob.Dogmthd();

	}

}
