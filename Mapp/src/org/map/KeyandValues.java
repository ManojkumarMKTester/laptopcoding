package org.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class KeyandValues {
public static void main(String[] args) {
//	//question 5.1
//Map<Integer,String> m=new LinkedHashMap<>();
//
//m.put(10,"Java");
//m.put(20,"sql");
//m.put(30,"oops");
//m.put(20,"Sql");
//m.put(40,"oracle");
//m.put(50,"DB");
//m.put(60,"Selenium");
//m.put(10,"psql");
//m.put(40,"hadoop");
//System.out.println("-----Hashmap------");
//Set<Entry<Integer, String>> kl = m.entrySet();
//for(Entry<Integer,String> x:kl){
//	System.out.println(x.getKey());
//	System.out.println(x.getValue());
//System.out.println();
//	
//}

////question 5.2
//Map<Integer,String> k=new LinkedHashMap<>();
//k.put(10,"10");
//k.put(20,"20");
//k.put(30,"30");
//k.put(40,"40");
//k.put(50,"50");
//k.put(60,"60");
//k.put(10,"10");
//k.put(50,"50");
//k.put(40, "40");
//System.out.println("-----LinkedHashmap------");
//Set<Entry<Integer, String>> k2 = k.entrySet();
//for(Entry<Integer,String> x:k2){
//	System.out.println(x.getKey());
//	System.out.println(x.getValue());
//System.out.println();
//	
//}
////question 5.3
//Map<Character,Integer> k1=new TreeMap<>();
//k1.put('!',10);
//k1.put('@',20);
//k1.put('#',30);
//k1.put('$',40);
//k1.put('%',50);
//k1.put('^',60);
//k1.put('&',10);
//k1.put('*',50);
//k1.put('(', 40);
//System.out.println("-----Treemap------");
//Set<Entry<Character, Integer>> k3 = k1.entrySet();
//for(Entry<Character,Integer> x:k3){
//	System.out.println(x.getKey());
//	System.out.println(x.getValue());
//System.out.println();
//}
//question 5.4
Hashtable<String,String> k2=new Hashtable<String,String>();
k2.put("Vel","Selenium");
k2.put("Ganesh","ramework");
k2.put("Dinesh","Oracle");
k2.put("Vengat","Corejava");
k2.put("Subash","Jira");

System.out.println("-----Hashtable------");
Set<Entry<String, String>> k4 = k2.entrySet();
for(Entry<String,String> x1:k4){
	System.out.println(x1.getKey());
	System.out.println(x1.getValue());
System.out.println();

}}}