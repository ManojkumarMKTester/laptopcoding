package org.road;

public class Road {
	public void bike() {
System.out.println("Bike on road");
	}
	public void cycle() {
		System.out.println("cycle on road");
			}
	public void bus() {
		System.out.println("bus on road");
			}
	public void car() {
		System.out.println("car on road");
			}
public static void main(String[] args) {
	Road rd=new Road();
	rd.bike();
	rd.cycle();
	rd.bus();
	rd.car();
}
}
