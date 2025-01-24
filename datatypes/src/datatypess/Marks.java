package datatypess;
import java.util.Scanner;
public class Marks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Std Id :");
		short empId=sc.nextShort();
		System.out.println("My Std Id :"+empId);
		
		System.out.println("Enter Std Name :");
		String empName=sc.next();
		System.out.println("Std Name is :"+empName);
		
		
		int Mark1, Mark2, Mark3, Mark4, Mark5; 
	    float total, Percentage, Average;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Five Subjects Marks : ");
		Mark1 = sc.nextInt();	
		Mark2 = sc.nextInt();	
		Mark3 = sc.nextInt();	
		Mark4 = sc.nextInt();	
		Mark5 = sc.nextInt();	
		
		total = Mark1 + Mark2 + Mark3 + Mark4 + Mark5;
		Average = total / 5;
	    Percentage = (total / 500) * 100;
	    
	    System.out.println(" Total Marks =  " + total);
	    System.out.println(" Average Marks =  " + Average);
	    System.out.println(" Marks Percentage =  " + Percentage);
		
	}
	
	
	}
