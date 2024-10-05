package oops;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading ob=new Methodoverloading();
		ob.add();
		ob.add(3, 4.8);
		ob.add(3.4, 7);
		ob.add(9, 2);

	}
	public void add()
	{
		int a=3,b=9,c;
		c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
	}
	

}
