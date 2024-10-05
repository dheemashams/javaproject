package oops;
interface BasicAnimal
{
 
	public void Eat();
	public void Sleep(); 
}
class Monkey
{
	public void Jump() {
		System.out.println("Monkey can jump");
	}
	public void bite() {
		System.out.println("monkey can bite");
	}
}
class Human extends Monkey implements BasicAnimal
{

	@Override
	public void Eat() {
		System.out.println("Fruits and vegies");
		
	
		
	}

	@Override
	public void Sleep() 
	{
		System.out.println("Must sleep 8hrs");
	}

}	
public class Inheritanceprgrm2 {

	public static void main(String[] args) {
		Human q=new Human();
		q.bite();
		q.Eat();
		q.Jump();
		q.Sleep();
		
	}
}

	




