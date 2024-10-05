package controlstructures;

import java.util.Scanner;

public class Scannerprgm {

	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println(c);
		System.out.println("Enter a string");
		String s1=sc.next();
		System.out.println(s1);
		System.out.println("Enter a character");
		char c1=sc.next().charAt(0);
		System.out.println(c1);
				
	}

}
