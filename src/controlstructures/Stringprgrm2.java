package controlstructures;

import java.util.Scanner;

public class Stringprgrm2 {

	public static void main(String[] args) {
		//6.to count the number of even and odd elements in a given array of integers
        Scanner w = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int e =w.nextInt();

        // Initialize the array
        int[] n1 = new int[e];

        // Get the array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < e; i++) {
            n1[i] = w.nextInt();
        }

        // Initialize counters for even and odd numbers
        int evenCount = 0;
        int oddCount = 0;

        // Traverse the array to count even and odd elements
        for (int i = 0; i < n1.length; i++) {
            if (n1[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Output the count of even and odd elements
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }


	}


