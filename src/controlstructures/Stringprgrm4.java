package controlstructures;

public class Stringprgrm4 {

	public static void main(String[] args) {
		//8.Insert a word in middle of a string.Insert 'Tutorial'in the middle of 'Java 3.0' so result as Java Tutorial 3.0
		String originalString = "Java 3.0";
        String wordToInsert = "Tutorial";

        // Find the middle index to insert the word
        int middleIndex = originalString.indexOf(" ");

        // Split the original string into two parts
        String firstPart = originalString.substring(0, middleIndex);
        String secondPart = originalString.substring(middleIndex);

        // Combine the parts with the word to be inserted
        String resultString = firstPart + " " + wordToInsert + secondPart;

        // Print the result
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + resultString);
    }


	}


