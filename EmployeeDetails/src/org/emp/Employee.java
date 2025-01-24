package org.emp;

public class Employee {
	// method 1
	private void empID() {
		
	System.out.println("The Emp ID 58026");
	}
	private void empName() {
		
		System.out.println("The EmpName Manojkumar");
		}
		
	private void empDob() {
		
		System.out.println("The EmpDob 11/01/2001");
		}
		
	private void empPhone() {
		
		System.out.println("The EmpPhone 1234567890");
		}
	private void empEmail() {
		
		System.out.println("The EmpEmail taskdaily@gmail.com");
		}
	private void empAddress() {
		
		System.out.println("The EmpAddress TIRUNELVELI");
		}
		public static void main(String[] args) {
			Employee obj=new Employee();
			obj.empID();
			obj.empName();
			obj.empDob();
			obj.empPhone();
			obj.empEmail();
			obj.empAddress();
		}

}
