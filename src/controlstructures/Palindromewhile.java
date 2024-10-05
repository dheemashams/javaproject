package controlstructures;

public class Palindromewhile {

	public static void main(String[] args) {
		int i=121,n=0,p;
		int temp=i;
		while(i>0);
		{
			p=i%10;
			n=n*10+p;
			i=i/10;
		}
		if(temp==n)
        {
        	System.out.println("palindrome");
        	
        }
		else
		{
			System.out.println("not palindrome");
		}
	}
	}


