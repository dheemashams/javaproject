package oops;

public class Accessmodifiers {
	private int a;
	int b;
	protected int c;
	

	public static void main(String[] args) {
		Accessmodifiers ob=new Accessmodifiers();
		System.out.println(ob.a);
		System.out.println(ob.b);
		Accessmodifiers ob1=new Accessmodifiers();
		System.out.println(ob1.c);

	}

}
