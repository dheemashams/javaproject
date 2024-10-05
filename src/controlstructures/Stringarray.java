package controlstructures;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
		String[]a=new String[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		for(int i=0;i<3;i++)
		{
			a[i]=sc.next();
		}
		System.out.println("Entered string is:");
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
		}

	}

}
