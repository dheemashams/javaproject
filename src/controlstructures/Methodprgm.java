package controlstructures;

public class Methodprgm {

	public static void main(String[] args) {
		Methodprgm ob=new Methodprgm();
		ob.add();
		int q=ob.sub();
		System.out.println("sub="+q);
		ob.mul(2,9);
		double l=ob.div(16,2 );
		System.out.println("div="+l);

	}
	//method without returntype and without parameter
	public void add()
	{
		int a=2,b=5,c;
		c=a+b;
		System.out.println("add="+c);		
	}
	//method with returntype and without parameter
	public int sub()
	{
		int a=6,b=9,c;
		c=a-b;
		return c;
		
	}
	//method without returntype and with parameter
	public void mul(int a,int b )
	{
		int c=a*b;
		System.out.println("mul="+c);
	}
	//method with returntype and with parameter
	public double div(double a,double b)
	{
		double d=a/b;
		return d;
	}

}
