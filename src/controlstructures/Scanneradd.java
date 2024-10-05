package controlstructures;

import java.util.Scanner;

public class Scanneradd {

	public static void main(String[] args) {
		char d;
		do
		{
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println(c);
		
		System.out.println("Do you want to continue? Y/N");
		d=sc.next().charAt(0);
		}while(d=='y'||d=='Y');
}
}

	


