package org.map;

import java.util.*;

public class PrintValues {
public static void main(String[] args) {

	//question 3.1
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

Collection<String> values = m.values();
System.out.println(values);
//question 3.2
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
Collection<String> values1 = k.values();
System.out.println(values);

//question 3.3
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
Collection<Integer> values2 = k1.values();
System.out.println(values2);	

//question 3.4
Hashtable<String,String> k2=new Hashtable<String,String>();
k2.put("Vel","Selenium");
k2.put("Ganesh","ramework");
k2.put("Dinesh","Oracle");
k2.put("Vengat","Corejava");
k2.put("Subash","Jira");

System.out.println("-----Hashtable------");
Collection<String> values3 = k2.values();
System.out.println(values3);

}
}
