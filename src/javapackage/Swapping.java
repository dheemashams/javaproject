package javapackage;

public class Swapping {

	public static void main(String[] args) {
		int a=30,b=20;
		int c;
		System.out.println("before swapping"+a + "value of b"+b);
		c=a;
		a=b;
		b=c;
		System.out.println("after swapping value of a=" +a + " value of b=" +b);
		
		//without variable
		a=a+b;//a=20+30=50
		b=a-b;//b=50-30=20
		a=a-b;//a=50-20=30
		
		System.out.println("after swapping value of a=" +a + " value of b=" +b);
		
		
		

	}

}
