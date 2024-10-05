package oops;
class Member
{
	String name;
	int age;
	String address;
	double phnno;
	long salary;
	public void memberDetails()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("address="+address);
		System.out.println("phnno="+phnno);
		System.out.println("salary="+salary);
	}
}
class Employee extends Member
{
	String specilization,department;
	public void memberDetails()
	{
		System.out.println("specilization="+specilization);
		System.out.println("department="+department);
	}
}
class Manager extends Member
{
	public void memberDetails()
	{
	}}

public class Inheritanceprgrm {

	public static void main(String[] args) {
		Member ob=new Member();
		ob.name="Shambu";
		ob.age=22;
		ob.phnno=982736543;
		ob.salary=500000;
		ob.address="chakki";
		ob.memberDetails();
		Employee ob1=new Employee();
		ob1.specilization="P.G";
		ob1.department="CSE";
		ob1.memberDetails();
		
		
		

	

	}	

}
