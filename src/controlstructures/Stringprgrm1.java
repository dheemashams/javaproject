package controlstructures;

import java.util.Scanner;
public class Stringprgrm1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Split the string into words
        String[] words = inputString.split(" ");

        // Create a StringBuilder to construct the result
        StringBuilder reversedString = new StringBuilder();

        // Traverse the words array from the end to the beginning
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            // Append a space between words, but not after the last word
            if (i > 0) {
                reversedString.append(" ");
            }
        }

        // Output the result
        System.out.println("Reversed String: " + reversedString.toString());
		
	    //2.s='hello world' replace to hi world
        String originalString = "Hello world";
        String substringToReplace = "Hello";
        String replacement = "hi";

        // Replace the substring
        String modifiedString = originalString.replace(substringToReplace, replacement);

        // Output the result
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    
	    //check a string is palindrome or not
	    System.out.println("Enter a string");
	    Scanner sl=new Scanner(System.in);
	    String q=sc.next();
	    String processedString = q.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversedString1 = new StringBuilder(processedString).reverse().toString();

        // Check if the original string is equal to the reversed string
        if (processedString.equals(reversedString1)) {
            System.out.println(q + " is a palindrome.");
        } else {
            System.out.println(q + " is not a palindrome.");
        }
        //4.program to find largest element in an array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initialize the array
        int[] numbers = new int[n];

        // Get the array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Assume the first element is the largest
        int largest = numbers[0];

        // Traverse the array to find the largest element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Output the largest element
        System.out.println("The largest element in the array is: " + largest);
        
        //5.pattern of right angled triangle with a number which repeats a number in a row as
        //1
        //2 3
        //4 5 6
        //7 8 9 10
        int m = 4;  // Number of rows
        int number = 1;

        for (int i = 1; i <= m; i++) {
            // Print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            // Move to the next line after each row
            System.out.println();
        }
	}
}

        
	
            


        
	

        
	
       

	


