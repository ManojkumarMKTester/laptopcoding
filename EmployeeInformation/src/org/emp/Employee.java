package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	public void empName() {
	     System.out.println("EmpName : Manojkumar");
		}
	public static void main(String[] args) {
		Employee em=new Employee();
		em.empName();
		
		Company cm=new Company();
		cm.companyName();
		
		Client cl=new Client();
		cl.clientName();
		
		Project pr=new Project();
		pr.projectName();
	}

}
