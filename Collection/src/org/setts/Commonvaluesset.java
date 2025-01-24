package org.setts;

import java.util.*;

public class Commonvaluesset {
public static void main(String[] args) {
	
	Set<Integer> s=new LinkedHashSet<>();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(90);
	s.add(10);
	s.add(10);
	s.add(40);
	s.add(50);
	
	Set<Integer> h=new LinkedHashSet<>();

	h.add(10);
	h.add(20);
	h.add(60);
	h.add(50);
	h.add(40);
	h.add(70);
	h.add(80);
	h.add(90);
//	System.out.println("Question 4.2 set");
////	h.retainAll(k);
////	System.out.println(h);
//	
	//question 5.2
	s.removeAll(h);
	System.out.println(s);

//	//question 4.3 and .3
//	Set<Integer> p=new TreeSet<>();
//	p.add(10);
//	p.add(20);
//	p.add(30);
//	p.add(40);
//	p.add(50);
//	p.add(60);
//	p.add(70);
//	p.add(80);
//	
//	Set<Integer> a=new TreeSet<>();
//	a.add(100);
//	a.add(200);
//	a.add(300);
//	a.add(400);
//	a.add(500);
//	a.add(600);
//	a.add(700);
//	a.add(800);
////	System.out.println("Question 4.3 nothing is common");
////	a.retainAll(p);
////	System.out.println(a);
//	//question 5.3
////	p.removeAll(a);
//	System.out.println(p);
}
	
	
}
