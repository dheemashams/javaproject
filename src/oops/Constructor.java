package oops;

public class Constructor {
	int stdid;
	String stdname;
	String stdquali;
	public Constructor(int stdid,String stdname,String stdquali)
	{
		this.stdid=stdid;
		this.stdname=stdname;
		this.stdquali=stdquali;
	}
	public void display()
	{
		System.out.println("stdid="+stdid);
		System.out.println("stdname="+stdname);
		System.out.println("stdquali="+stdquali);
	}

	public static void main(String[] args) {
		Constructor s1=new Constructor(101,"vishal","BCA");
		s1.display();
		Accessmodifiers ob=new Accessmodifiers();
		System.out.println(ob.b);

	}

}
