package edu.st;

class Emp{
	int id;
	String name;
	int sal;
	String address;
	String company;
	public Emp(int id, String name, int sal, String address, String company) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.address = address;
		this.company = company;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + ", address=" + address + ", company=" + company
				+ "]";
	}
}
public class Test {

	public static void main(String[] args) {
		
		Emp e1 = new Emp(100,"Ramu",45000,"Hyd","Hp");
		System.out.println(e1);
		
		
		
	}

}c