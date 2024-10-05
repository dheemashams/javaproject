package controlstructures;

public class largestofthreenumbers {

	public static void main(String[] args) {
		int a1=10,a2=30,a3=5;
		if(a1>a2&&a1>a3)
		{
			System.out.println("A1 is greater");
		}
		else if(a2>a3&&a2>a1)
		{
			System.out.println("A2 is greater");
		}
		else
			System.out.println("A3 is greater");

	}

}
