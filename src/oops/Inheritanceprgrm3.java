package oops;

import java.util.Scanner;

interface Bank
{
	void Accoutdetails();
	void Balance();
	void Withdraw();
	void Deposit();
}
class Sbi implements Bank
{
	int balance=10000;
	static String bname="SBI";
	Scanner s=new Scanner(System.in);

	@Override
	public void Accoutdetails() {
		System.out.println("Enter your accnumber:");
		long accnumber=s.nextLong();
		System.out.println("Enter ifsc code:");
		String ifsc=s.next();
		System.out.println("Enter your name:");
		String name=s.next();
		System.out.println("your name:"+name);
		System.out.println("your bankname:"+bname +"Your accountnumber and ifsc code"+accnumber +ifsc);
		
	}

	@Override
	public void Balance() {
		System.out.println(balance);
		
	}

	@Override
	public void Withdraw() {
		System.out.println("Enter your withdraw amount:");
		int w=s.nextInt();
		balance=balance-w;
		System.out.println("your current balance:"+balance);
		
	}

	@Override
	public void Deposit() {
		System.out.println("Enter your deposited amount:");
		int d=s.nextInt();
		balance=balance+d;
		System.out.println("your current balance:"+balance);
		
		
	}
	
}

public class Inheritanceprgrm3 {

	public static void main(String[] args) {
		Sbi ob=new Sbi();
		ob.Accoutdetails();
		ob.Balance();
		ob.Withdraw();
		ob.Balance();

	}

}
