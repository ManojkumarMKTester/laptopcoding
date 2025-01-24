package org.add;

public class GreensTech {
	private void greensOmr(String a) {
		// method overloading
		System.out.println("company name "+a);
	
	}
	private void greensOmr(int b) {
		System.out.println("Comp id "+b);

	}
	private void greensOmr(String a,int b) {
		System.out.println("company name "+a);
		System.out.println("Comp id "+b);
}
	private void greensOmr(double c,String a,int b) {
	System.out.println("company name "+a);
	System.out.println("Comp id "+b);
	System.out.println("Comp number "+c);

}
public static void main(String[] args) {
	GreensTech nm=new GreensTech();
	nm.greensOmr(565);
	nm.greensOmr("Greens");
	nm.greensOmr(1265897451l, "Green", 565);

	
	
	
}
	}