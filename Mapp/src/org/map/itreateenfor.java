package org.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class itreateenfor {
public static void main(String[] args) {
//	//question 4.1
Map<Integer,String> m=new HashMap<>();

m.put(10,"Java");
m.put(20,"sql");
m.put(30,"oops");
m.put(20,"Sql");
m.put(40,"oracle");
m.put(50,"DB");
m.put(60,"Selenium");
m.put(10,"psql");
m.put(40,"hadoop");
System.out.println("-----Hashmap------");
Set<Entry<Integer, String>> entrySet = m.entrySet();
System.out.println(entrySet);
//question 4.2
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
Set<Entry<Integer, String>> entrySet2 = k.entrySet();
System.out.println(entrySet2);

//question 4.3
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
Set<Entry<Character, Integer>> entrySet3 = k1.entrySet();
System.out.println(entrySet3);	

//question 4.4
Hashtable<String,String> k2=new Hashtable<String,String>();
k2.put("Vel","Selenium");
k2.put("Ganesh","ramework");
k2.put("Dinesh","Oracle");
k2.put("Vengat","Corejava");
k2.put("Subash","Jira");

System.out.println("-----Hashtable------");
Set<Entry<String, String>> entrySet = k2.entrySet();
System.out.println(entrySet);

}
	
}
