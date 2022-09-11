package Comparableprogram;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HH {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "hell");
		hashMap.put(1, "dfghjk");
		hashMap.put(1, "sdfgb");
		System.out.println(hashMap);
		
		
		Hashtable<Object, Object> hashtable = new Hashtable<>();
		hashtable.put(1, "cvbhnjmk");
		hashtable.put(1, "fghn");
		hashtable.put(2, "njmk");
		System.out.println(hashtable);
		
		
		LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(1, "asxdc");
		linkedHashMap.put(2, "sd");		
		linkedHashMap.put(1, "ghjks");		
System.out.println(linkedHashMap);
		
TreeMap<Object, Object> treeMap = new TreeMap<>();
		
	}
	
}
