package org.college;

public class College {
	public void collegeName() {
		System.out.println(" Clg : PSR ENGG CLG");
			}
	public void collegeCode() {
		System.out.println(" Clg code : PSR014");
			}
	public void collegeRank() {
		System.out.println(" Clgrank :A++");
			}
	
			public static void main(String[] args) {
				College el=new College();
				el.collegeName();
				el.collegeCode();
				el.collegeRank();
				//student class object creation and method call
				Student mk=new Student();
				mk.studentName();
				mk.studentDept();
				mk.studentId();
				//hostel class object creation and method call
				Hostel ho=new Hostel();
				ho.hostelName();
				//dept class object creation and method cal
				Dept dpt=new Dept();
				dpt.deptName();
			}

}
