package controlstructures;

import java.util.Scanner;

public class Methodprgrmarea {

	public static void main(String[] args) {
		System.out.println("Enter length and breadth:");
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter breadth and height:");
		double c=sc.nextDouble();
		double h=sc.nextDouble();
		Methodprgrmarea ob=new Methodprgrmarea();
		ob.rec(l,b);
		double o=ob.tria(c, h);
		System.out.println("Area of triangle="+o);
		ob.square();
		ob.circle();
	}
	public void rec(int l,int b)
	{
		int r=l*b;
		System.out.println("Area of rectangle="+r);
	}
	public double tria(double c,double h)
	{
	
		double q=0.5*c*h;
		return q;
		
	}
	public void circle()
	{
		double r=6;
		double m=3.14*r*r;
		System.out.println("Area of circle="+m);
		
	}
	public void square()
	{
		int a=4;
		int s=a*a;
		System.out.println("Area of square="+s);
		
	}
	

}
