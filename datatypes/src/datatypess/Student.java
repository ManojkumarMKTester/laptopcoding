package datatypess;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter Student Id :");
		short StudentId=s.nextShort();
		System.out.println("Student id :"+StudentId);
		
		System.out.println("Enter Student Name :");
		String StudentName=s.next();
		System.out.println("Std Name is :"+StudentName);
		
		s.nextLine();
		
		System.out.println("Enter student Email :");
		String StudentEmail=s.next();
		System.out.println("student email is :"+StudentEmail);
		
		System.out.println("Enter StudentPhoneno NO :");
		long StudentPhoneno=s.nextLong();
		System.out.println("Std PhoneNo :"+StudentPhoneno);
		
		System.out.println("Enter student Dept :");
		String StudentDept=s.next();
		System.out.println("StudentDept is :"+StudentDept);
		
	
		System.out.println("Enter StudentGender Gender :");
		String n=s.next();
		char empGender=n.charAt(2);
		System.out.println("Std Gender IS :"+empGender);

		s.nextLine();
		
		System.out.println("Enter StudentCity City : ");
		String StudentCity=s.next();
		System.out.println("Std City IS :"+StudentCity);
		

	}


}
