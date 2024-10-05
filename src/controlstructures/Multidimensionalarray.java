package controlstructures;

import java.util.Scanner;

public class Multidimensionalarray {

	public static void main(String[] args) {
		int[][]ml=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				ml[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Enterered numbers:");
		
	//or(int i=0;i<3;i++)
	//
	//for(int j=0;j<3;j++)
	//{
	//	System.out.print(ml[i][j]+" ");
		
	//}
	//System.out.println();
	//
      for(int v[]:ml)
      {
    	  for(int v1:v)
    	  {
    		  System.out.print(v1+" ");  
    		  }
    	  System.out.println();
    		  
      }
	}

}
