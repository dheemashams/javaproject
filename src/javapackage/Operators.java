package javapackage;

public class Operators {

	public static void main(String[] args) {
		System.out.println("----------------Arithmetic Operators--------------");
		int a=50,b=10;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		System.out.println("----------------Assignment Operators--------------");
		int c=b;
		System.out.println("c"+b);
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println("----------------Relational Operators--------------");
		int v1=20,v2=30;
		System.out.println(v1<v2);
		System.out.println(v1>v2);
		System.out.println(v1<=v2);
		System.out.println(v1>=v2);
		System.out.println(v1!=v2);
		System.out.println(v1==v2);
		System.out.println("----------------Logical Operators--------------");
		String username="ABLE";
		String password="ABLE123";
		System.out.println(username=="ABLE"&& password=="ABLE123");
		System.out.println(username=="ALE"|| password=="ABLE123");
		System.out.println(!(username=="ABLE"));
		System.out.println("----------------Unary Operators--------------");
		int h=3;
		System.out.println(++h);
		System.out.println(h++);
		System.out.println(h);
		System.out.println(--h);
		System.out.println(h--);
		System.out.println(h);
		System.out.println("----------------Ternary Operators--------------");
		String s8=v1>v2?"v1 greater":"v2 is greater";
		System.out.println(s8);
		

	}

}
