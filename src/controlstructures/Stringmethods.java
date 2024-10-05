package controlstructures;

public class Stringmethods {

	public static void main(String[] args) {
		String s1="Appu";
		String s2="   Tippu";
		String s3="Appu tippu";
		//concat
		System.out.println(s1.concat(s2));
		System.out.println(1+3+s1+5+2+s3);
		//equals
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		//contains
		System.out.println(s3.contains("tippu"));
		//startswith and endswith
		System.out.println(s1.startsWith("Appu"));
		System.out.println(s3.endsWith("tippu"));
		//length
		System.out.println(s3.length());
		//trim
		System.out.println(s2.trim());
		//chatAt
		System.out.println(s2.charAt(0));
		//replace
		System.out.println(s3.replace("tippu","suppu"));
		//toupper and tolower
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		//substring
		System.out.println(s3.substring(1,5));
		//tochararray
		char[]c1=s3.toCharArray();
		for(char c:c1)
		{
		System.out.println(c);
		}
		//split
		String st[]=s3.split(" ");
		for(String s:st)
		{
			System.out.println(s);
		}
		
	} 


}
