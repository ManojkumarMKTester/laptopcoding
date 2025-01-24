package org.bike;

public class Ktm extends Bike{
 @Override
public void cost() {
System.out.println("Cost is :152015 ");	
super.cost();
}
 @Override
	public void speed() {
 System.out.println("Speed is 120 KM ");
	 super.speed();
	}
 public static void main(String[] args) {
	 Ktm nm=new Ktm();
	 nm.cost();
	 nm.speed();
}
}
