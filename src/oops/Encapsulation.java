package oops;
class Empdetails
{
	private int empid;
	private String empname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		Empdetails ob=new Empdetails();
		ob.setEmpid(11);
		ob.setEmpname("lala");
		System.out.println(ob.getEmpid());
		System.out.println(ob.getEmpname());
	}

}
