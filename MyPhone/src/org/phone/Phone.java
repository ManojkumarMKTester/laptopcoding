package org.phone;
//method overload
public class Phone {
	private void phoneInfo(int a,double b,String c) {
System.out.println("Phone Id : "+a);
System.out.println("Phone Price :"+b);
System.out.println("Phone Name is"+c);
	}
	private void phoneInfo(String c,int a,double b) {
		System.out.println("Phone Name is"+c);
		System.out.println("Phone Id : "+a);
		System.out.println("Phone Price :"+b);
			}
	private void phoneInfo(String c,double b,int a) {
		System.out.println("Phone Name is"+c);
		System.out.println("Phone Price :"+b);
		System.out.println("Phone Id : "+a);
			}
	public static void main(String[] args) {
		Phone p=new Phone();
		p.phoneInfo(45, 45000.5, "Vivo");
		p.phoneInfo("Vivo", 45000.5, 45);
		p.phoneInfo("Vivo", 45, 45000.5);
	}
}
