package controlstructures;

import java.util.Scanner;

public class Arraysum {

	public static void main(String[] args) {
		int sum=0;
		int[] a=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];

		}
		System.out.println("Entered numbers sum are:"+sum);
		 
			
			
		}	
		

	}


