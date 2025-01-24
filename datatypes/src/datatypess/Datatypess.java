package datatypess;

import java.util.Scanner;

public class Datatypess {
		public static void main(String[] args) {
			
			Scanner s=new Scanner(System.in);
			
			
			System.out.println("Enter Emp Id :");
			short empId=s.nextShort();
			System.out.println("My Emp Id :"+empId);
			
			System.out.println("Enter Emp Name :");
			String empName=s.next();
			System.out.println("Emp Name is :"+empName);
			
			s.nextLine();
			
			System.out.println("Enter Emp Email :");
			String empEmail=s.next();
			System.out.println("Emp Email is :"+empEmail);
			
			System.out.println("Enter Emp Phone NO :");
			long empPhoneno=s.nextLong();
			System.out.println("My PhoneNo :"+empPhoneno);
			
			System.out.println("Enter Emp Salery :");
			float empSalary=s.nextFloat();
			System.out.println("My Salery is : "+empSalary);
			
			
			System.out.println("Enter Emp Gender :");
			String n=s.next();
			char empGender=n.charAt(2);
			System.out.println("Emp Gender IS :"+empGender);
	
			s.nextLine();
			
			System.out.println("Enter Emp City : ");
			String empCity=s.next();
			System.out.println("Emp Gender IS :"+empCity);
			

		}

	}


