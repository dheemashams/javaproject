package oops;

public class Methodprgrm3 {
	//write a java program to test if a given string contains the specified string
	//as input="java language is platform independent " check language is present in this input
	 public boolean contains(String mainString, String subString) {
	        return mainString.contains(subString);
	    }

	public static void main(String[] args) {
		Methodprgrm3 ob = new Methodprgrm3();

        // Input string
        String input = "java language is platform independent";

        // Check if "language" is present in the input string
        boolean result = ob.contains(input, "language");

        System.out.println("Is 'language' present in the input? " + result);
		

	}

}
