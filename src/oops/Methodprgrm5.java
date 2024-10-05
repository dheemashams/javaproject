package oops;

public class Methodprgrm5 {
	//5.write a java program to check whether a number is prime or not
	 public boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;  
	        }

	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;  
	            }
	        }

	        return true; 
	    }


	public static void main(String[] args) {
		    Methodprgrm5 c = new Methodprgrm5();
		    int number1 = 29;
	        int number2 = 15;

	        
	        System.out.println(number1 + " is prime? " + c.isPrime(number1));  
	        System.out.println(number2 + " is prime? " + c.isPrime(number2));  


	}

}
