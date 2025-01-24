package org.map;

import java.util.*;

public class Mapss {
public static void main(String[] args) {
	//question 1.2
	Map<Integer,String> m=new HashMap<>();
	
	m.put(10,"Java");
	m.put(20,"sql");
	m.put(30,"oops");
	m.put(20,"Sql");
	m.put(40,"oracle");
	m.put(50,"DB");
	m.put(60,"Selenium");
	m.put(10,"psql");
	m.put(0,"hadoop");
	System.out.println("-----Hashmap------");
	System.out.println(m);
	
	//question 1.2
	Map<Integer,String> k=new LinkedHashMap<>();
	k.put(10,"10");
	k.put(20,"20");
	k.put(30,"30");
	k.put(40,"40");
	k.put(50,"50");
	k.put(60,"60");
	k.put(10,"10");
	k.put(50,"50");
	k.put(40, "40");
	System.out.println("-----LinkedHashmap------");
	System.out.println(k);
	
	//question 1.3
	Map<Character,Integer> k1=new TreeMap<>();
	k1.put('!',10);
	k1.put('@',20);
	k1.put('#',30);
	k1.put('$',40);
	k1.put('%',50);
	k1.put('^',60);
	k1.put('&',10);
	k1.put('*',50);
	k1.put('(', 40);
	System.out.println("-----Treemap------");
	System.out.println(k1);
	
	
	
	
}
}
