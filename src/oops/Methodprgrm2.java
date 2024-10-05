package oops;

import java.util.Scanner;

public class Methodprgrm2 {
//2.Write a java method to compute the sum of digits in an integer
	
		
	public int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10; 
            sum += digit;            
            number /= 10;         
        }

        return sum;
    }

    public static void main(String[] args) {
        Methodprgrm2 ob = new Methodprgrm2();
        int q=ob.sumOfDigits(12456);
        
       

        System.out.println("Count is:" + q );
  
       
      
	}

}
