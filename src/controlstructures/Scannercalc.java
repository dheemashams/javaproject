package controlstructures;

import java.util.Scanner;

public class Scannercalc {

	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		System.out.println("Enter a choice");
		char c4=sc.next().charAt(0);
		switch(c4)
		{
		case '+':System.out.println("add a+b=" +(a+b));
		break;
		case '-':System.out.println("sub a-b=" +(a-b));
		break;
		case '*':System.out.println("div a*b=" +(a*b));
		break;
		case '/':System.out.println("mul a/b=" +(a/b));
		break;
		default:System.out.println("Invalid");
		}
		

	}

}