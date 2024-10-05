package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionprgrm {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		FileInputStream ob=new FileInputStream("C.//Documents.bxcx");
		
		try
		{
		int a=7,b=9,c;
		c=a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		System.out.println("Arithmetic exception is handled");
		try 
		{
			String n=null;
			System.out.println(n.length());
		}
		catch(NullPointerException e )
		{
			System.out.println(e.getMessage());
		}

	}

}
