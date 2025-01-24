package org.setts;

import java.util.HashSet;
import java.util.*;
import java.util.Set;

public class Enhanced {
//Get the each value of set by using enhanced  for loop
	public static void main(String[] args) {
		Set<Integer> lk=new HashSet<>();
		lk.add(105);
		lk.add(205);
		lk.add(305);
		lk.add(405);
		lk.add(505);
		lk.add(605);
		lk.add(705);
		lk.add(805);
		System.out.println("------value get Enhanced for----------");
		for(int x:lk) {
			System.out.println(x);
		}
			Set<Integer> s=new TreeSet<>();
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
			System.out.println("------Treeset----------");
			for(int m:s) {
				System.out.println(m);
			}
			//hashset
				Set<Integer> ms=new HashSet<>();
				ms.addAll(s);
				System.out.println("------Hashett----------");
				for(int x:ms) {
					System.out.println(x);
				}
				}
			}
			