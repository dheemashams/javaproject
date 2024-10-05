package controlstructures;

import java.util.Scanner;

public class Scannerpali {

	public static void main(String[] args) {
		System.out.println("Enter a numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int r=0,i;
		int p=a;
		while(a>0) {
			i=a%10;
			r=r*10+i;
			a=a/10;
		}
		if(p==r)
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		}
		
			

	}


