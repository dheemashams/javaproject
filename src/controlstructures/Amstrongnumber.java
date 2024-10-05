package controlstructures;

public class Amstrongnumber {

	public static void main(String[] args) {
		int i=123,n=0,a;
	
		int temp=i;
		while(i>0)
		{
			a=i%10;
			n=n+a*a*a;
			i=i/10;
		}
		if(temp==n)
		{
			System.out.println("armstrong number"+temp);
		}
		else
		{
			System.out.println("not armstrong number"+temp);
		}
		

	}

}
