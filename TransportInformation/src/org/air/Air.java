package org.air;

public class Air {
	public void aeroPlane() {
System.out.println("Airport transport");
	}
	public void heliCopter() {
System.out.println("heliCopter transport");
	}
	public static void main(String[] args) {
		Air ai=new Air();
		ai.aeroPlane();
		ai.heliCopter();
	}
}
