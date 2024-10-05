package oops;

public class Methodprgrm4 {
	// 4.java program to find largest element in an array
	public int findLargest(int[] array) {
        int largest = array[0];  // Assume the first element is the largest initially

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];  // Update largest if current element is greater
            }
        }

        return largest;
    }
	

	public static void main(String[] args) {
		Methodprgrm4 finder = new Methodprgrm4();

        // Example array
        int[] numbers = {25, 47, 89, 14, 36, 79};

        // Find the largest element
        int largest = finder.findLargest(numbers);

        // Print the result
        System.out.println("The largest element in the array is: " + largest);
		

	}

}
