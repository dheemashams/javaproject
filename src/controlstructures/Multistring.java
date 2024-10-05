package controlstructures;

import java.util.Scanner;

public class Multistring {

	public static void main(String[] args) {
		String[][]ml=new String[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				ml[i][j]=sc.next();
				
			}
		}
		System.out.println("Enterered strings:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(ml[i][j]+" ");
		
			}
			System.out.println();
		}

	}



	}


