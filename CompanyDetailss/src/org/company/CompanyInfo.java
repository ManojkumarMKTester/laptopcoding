package org.company;

public class CompanyInfo {
	private void companyName(int a,String b) {
//method overload
		System.out.println("Cmp ID Is : "+a);
		System.out.println("Cmp Name Is : "+b);

	}
	private void companyName(String b,int a,long c) {
		//method overload
				System.out.println("Cmp ID Is : "+a);
				System.out.println("Cmp Name Is : "+b);
				System.out.println("Cmp Phn no : "+c);
			}
	public static void main(String[] args) {
		CompanyInfo n=new CompanyInfo();
		n.companyName(45, "Greens");
		n.companyName("Greens", 45, 4512659878l);
	}
}
