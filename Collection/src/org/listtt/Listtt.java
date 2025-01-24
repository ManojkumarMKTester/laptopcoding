package org.listtt;

import java.util.*;

public class Listtt {
	
	public static void main(String[] args) {
//		
//		ArrayList<Integer> L=new ArrayList<>();
//		L.add(10);
//		L.add(20);
//		L.add(30);
//		L.add(90);
//		L.add(10);
//		L.add(10);
//		L.add(40);
//		L.add(50);
//int size = L.size();
//System.out.println("Len of array");
//System.out.println(size);
//
////question4.3
//List<Integer> lk=new LinkedList<>();
//lk.add(105);
//lk.add(205);
//lk.add(305);
//lk.add(405);
//lk.add(505);
//lk.add(605);
//lk.add(705);
//lk.add(805);
//lk.add(505);
//lk.add(605);
//int size2 = lk.size();
//System.out.println("Len of array "+size2);

//create vector 4.4
//		Vector<Integer> lk=new Vector<>();
//		lk.add(105);
//		lk.add(205);
//		lk.add(305);
//		lk.add(405);
//		lk.add(505);
//		lk.add(605);
//		lk.add(705);
//		lk.add(805);
//		int size2 = lk.size();
//		System.out.println("Len of vector array "+size2);
		
		//question 6.2
//		List<Integer> m=new LinkedList<>();
//		m.add(100);
//		m.add(200);
//		m.add(300);
//		m.add(400);
//		m.add(500);
//		m.add(600);
//		m.add(700);
//		int size2 = m.get(4);
//	System.out.println("value of 4 index "+size2);
		
//6.3
		List<Integer> lk=new LinkedList<>();
		lk.add(105);
		lk.add(205);
		lk.add(305);
		lk.add(405);
		lk.add(505);
		lk.add(605);
		lk.add(705);
		lk.add(805);
//		Integer integer = lk.get(8);
//		System.out.println("value o 8th index : "+integer);
		
		
//		//question 6.4 itreate vales use normal for loop
//		for(int i=0;i<lk.size();i++) {
//			System.out.println(lk.get(i	));
			
			//question 6.5 itrate values use enhanced forloop
		System.out.println("itrate value use enhanced for");
			for(Integer x:lk) {
				
				System.out.println(x);
			
			
			
		}
	}

}
