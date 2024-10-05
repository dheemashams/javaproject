package controlstructures;

import java.util.Scanner;

public class Arrayprgrm {

	public static void main(String[] args) {
		int i=0;
		int[]a=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		for(i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Entered numbers are:");
		for(i=0;i<3;i++)
		{
			System.out.println(a[i]);
			
		}

	}

}
