package controlstructures;

public class Reversenumber {

	public static void main(String[] args) {
		int i=456,n=0,r;
		while(i>0)
		{
		 r=i%10;
		 n=n*10+r;
		 i=i/10;
		 }
      System.out.println("reverse=" +n);
	}

}
