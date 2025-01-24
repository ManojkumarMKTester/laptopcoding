package org.setts;

import java.util.*;

public class ListtoSet {
	//List to Set Covertion Question 2.1
	
public static void main(String[] args) {
	
	List<Integer> L=new LinkedList<>();
	L.add(10);
	L.add(20);
	L.add(30);
	L.add(90);
	L.add(10);
	L.add(10);
	L.add(40);
	L.add(50);
	 //set creation
	Set<Integer> ls=new LinkedHashSet<>();
	ls.addAll(L);
	System.out.println("List to Set AddAll()");
	System.out.println(ls);
	System.out.println("-------------");
	List<Integer> lk=new LinkedList<>();
	lk.add(105);
	lk.add(205);
	lk.add(305);
	lk.add(405);
	lk.add(505);
	lk.add(605);
	lk.add(705);
	lk.add(805);
	lk.add(505);
	lk.add(605);
	 //set creation
	Set<Integer> sl=new LinkedHashSet<>();
	sl.addAll(lk);
	System.out.println("List to Set AddAll()");
	System.out.println(sl);
	
	//Question 2.3
	System.out.println("-------------");
	List<Integer> m=new LinkedList<>();
	m.add(100);
	m.add(200);
	m.add(300);
	m.add(400);
	m.add(500);
	m.add(600);
	m.add(700);
	m.add(100);
	m.add(300);
	m.add(500);
	 //set creation
	Set<Integer> s=new LinkedHashSet<>();
	s.addAll(m);
	System.out.println("List to Set AddAll()");
	System.out.println(s);
	
	
	
	
	
}

}
