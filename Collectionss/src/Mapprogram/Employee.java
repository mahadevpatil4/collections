package Mapprogram;

import java.util.Map.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Employee {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(null, "asd");
		hashMap.put(null, "pasd");
		hashMap.put(10, "po");
		hashMap.put(20, "oio");
		hashMap.put(40, "o");
		hashMap.put(90, "h");
		hashMap.put(10, "hij");
		System.out.println(hashMap);
		System.out.println("=======================");

		Set<Entry<Integer, String>> entrySet3 = hashMap.entrySet();
		for (Entry<Integer, String> entry : entrySet3) {
			System.out.println(entry);
		}

		Hashtable<Object, Object> hashtable = new Hashtable<>();
		hashtable.put(null, "as");

		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "hari");
		treeMap.put(2, "rahul");
		treeMap.put(3, "hhh");
		treeMap.put(4, "iii");
		treeMap.put(null, "sd");

		System.out.println();
		for (int i = 1; i < treeMap.size(); i++) {
			System.out.println(treeMap.get(i));
		}
		System.out.println("--------------------");

		Set<Entry<Integer, String>> entrySet2 = treeMap.entrySet();
		for (Entry<Integer, String> entry : entrySet2) {
			System.out.println(entry);
		}

		Set<Entry<Integer, String>> entrySet = treeMap.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			String value = entry.getValue();
			System.out.println(value);
			Integer key = entry.getKey();
			System.out.println(key);
		}

		Set<Integer> keySet = treeMap.keySet();
		for (Integer integer : keySet) {
			System.out.println(integer);
		}
		Collection<String> values = treeMap.values();
		for (String string : values) {
			System.out.println(string);
		}

	}
}
