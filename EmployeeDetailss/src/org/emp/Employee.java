package org.emp;

public class Employee {
	private void empId(int a) {
		System.out.println("Emp Id Is :"+a);
	}
	private void empId(String b) {
		System.out.println("Emp Name Is :"+b);

	}
	private void empId(int a,String b) {
		System.out.println("Emp Id Is :"+a);
		System.out.println("Emp Name Is :"+b);

	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empId(78565);
		e.empId("ram");
		e.empId(78565, "ram");
		
	}
}
