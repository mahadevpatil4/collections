package Mapprogram;

import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Set;

public class Mapdesc {

	private static final Object Key = null;

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "hari");
		hashMap.put(7, "rahul");
		hashMap.put(9, "pari");
		hashMap.put(9, "hhul");

	
		
		Set<Entry<Integer, String>> entrySet2 = hashMap.entrySet();
		for (Entry<Integer, String> entry : entrySet2) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println("[][][][][][][][][][][][][][][");

		HashSet<Object> hashSet = new HashSet<>(entrySet2);
		System.out.println(hashSet);


		
		ArrayList<Object> arrayList4 = new ArrayList<>(entrySet2);
		ListIterator<Object> listIterator4 = arrayList4.listIterator(arrayList4.size());
		while (listIterator4.hasPrevious()) {

			System.out.println(listIterator4.previous());
		}

		System.out.println("[[[[[[[[[[[[[[[[[[[");

		Set<Integer> keySet2 = hashMap.keySet();
		for (Integer integer : keySet2) {
			System.out.println(integer);
		}

		Collection<String> values2 = hashMap.values();

		Iterator<Entry<Integer, String>> iterator = hashMap.entrySet().iterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}

		System.out.println("=================+");

		ArrayList<Object> arrayList = new ArrayList<>(hashMap.entrySet());

		ListIterator<Object> listIterator = arrayList.listIterator(hashMap.size());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

		ArrayList<Object> arrayList2 = new ArrayList<>(hashMap.keySet());

		ListIterator<Object> listIterator1 = arrayList2.listIterator(hashMap.size());
		while (listIterator1.hasPrevious()) {
			System.out.println(listIterator1.previous());
		}
		ArrayList<Object> arrayList3 = new ArrayList<>(hashMap.values());
		ListIterator<Object> listIterator2 = arrayList.listIterator(hashMap.size());
		while (listIterator2.hasPrevious()) {
			System.out.println(listIterator2.previous());
		}

		System.out.println("=================================");

		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}

		ListIterator<Object> listIterator3 = arrayList.listIterator(hashMap.size());
		while (listIterator3.hasPrevious()) {
			System.out.println(listIterator3.previous());
		}

		Set<Integer> keySet = hashMap.keySet();
		for (Integer integer : keySet) {
			System.out.println(integer);
		}

		Collection<String> values = hashMap.values();
		for (String string : values) {
			System.out.println(string);
		}

	}

}
