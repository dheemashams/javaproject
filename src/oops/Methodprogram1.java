package oops;

import java.util.Scanner;

public class Methodprogram1 {


		// 1.Count all words in a string
	public int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.split(" ");
        return words.length;
	}
	
        public static void main(String[] args) {
            Methodprogram1 counter = new Methodprogram1();
            System.out.println("Count is: " + counter.countWords("Hello world is a language"));


	}

}
