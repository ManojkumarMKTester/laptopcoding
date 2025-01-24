package org.setts;

import java.util.*;


//Question 1.1 
public class Setts {
public static void main(String[] args) {
	Set<Integer> s=new HashSet<>();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(40);
	s.add(50);
	s.add(60);
	s.add(70);
	s.add(80);
	s.add(90);
	s.add(10);
	s.add(20);
	System.out.println("------HashSet----------");
	System.out.println(s);
	
	//Question1.2
	Set<Integer> ls=new LinkedHashSet<>();
	ls.add(10);
	ls.add(20);
	ls.add(30);
	ls.add(40);
	ls.add(50);
	ls.add(60);
	ls.add(70);
	ls.add(80);
	ls.add(90);
	ls.add(10);
	ls.add(20);
	System.out.println("------LinkedHashSet----------");
	System.out.println(ls);
	
	//Question 1.3 
	Set<Integer> ts=new LinkedHashSet<>();
	ts.add(10);
	ts.add(20);
	ts.add(30);
	ts.add(40);
	ts.add(50);
	ts.add(60);
	ts.add(70);
	ts.add(80);
	ts.add(90);
	ts.add(10);
	System.out.println("------TreeSet----------");
	System.out.println(ts);
	
	
}
	
	
}
