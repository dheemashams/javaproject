package oops;

public class Methodoverriding {

	public static void main(String[] args) {
		Son s=new Son();
		s.education();
		s.phone();
		

	}
}
class Father
{
	public void education()
	{
		System.out.println("BA");
	}
	public void phone()
	{
		System.out.println("OPPO");
	}
}
class Son extends Father
{

	@Override
	public void education() {
		System.out.println("Bcom");
		super.education();
	}

	@Override
	public void phone() {
		System.out.println("VIVO");
		super.phone();
	}
	
	
}
