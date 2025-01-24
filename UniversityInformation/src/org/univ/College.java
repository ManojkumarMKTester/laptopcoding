package org.univ;

public class College extends University {
@Override
public void ug() {
System.out.println("Engineering UG");
	super.ug();
}
@Override
public void pg() {
System.out.println("Ars College");
super.pg();
	}
public static void main(String[] args) {
	College cl=new College();
	cl.ug();
	cl.pg();
}
}
