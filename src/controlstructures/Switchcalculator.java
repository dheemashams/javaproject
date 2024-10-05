package controlstructures;

public class Switchcalculator {

	public static void main(String[] args) {
		int a=10,b=15;
		char c='-';
		switch(c)
		{
		case '+':System.out.println("add a+b=" +(a+b));
		break;
		case '-':System.out.println("sub a-b=" +(a-b));
		break;
		case '/':System.out.println("div a/b=" +(a/b));
		break;
		case '%':System.out.println("mul a%b=" +(a%b));
		break;
		default:System.out.println("Invalid");
		}
		
		
	}

}
