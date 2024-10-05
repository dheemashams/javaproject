package controlstructures;

import java.util.Scanner;

public class Foreachloop {

	public static void main(String[] args) {
		int[]a=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int a1:a)
		{
			
			System.out.println(a1);
		}
		

	}

}
