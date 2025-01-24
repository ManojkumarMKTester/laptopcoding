package org.edu;

public class Arts extends Education {
private void bSc() {
System.out.println("BSE CSE");
}
private void bEd() {
System.out.println("BED Degree");
}
private void bBA() {
System.out.println("BBA Degree");
}
 @Override
	public void ug() {
	 System.out.println("UG degree 4 Yrs");
		super.ug();
	}
	
	@Override
		public void pg() {
System.out.println("Pg college 3.5 yrs ");			super.pg();
		}
	public static void main(String[] args) {
		Arts a=new Arts();
		a.bBA();
		a.bEd();
		a.bSc();
		a.ug();
		a.pg();
	}
}
