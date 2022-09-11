package Mapprogram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Student {
	public static void main(String[] args) {

		HashMap<Long, String> hashMap = new HashMap<>();
		
		hashMap.put(1567890678l, "harifghjkl");
		hashMap.put(24567890l, "rahul");
		hashMap.put(14567890l, "anil");
		hashMap.put(34567890l, "raju");
		
		// System.out.println(hashMap);

		
		Set<Entry<Long, String>> entrySet = hashMap.entrySet();
		for (Entry<Long, String> entry : entrySet) {
			String value = entry.getValue();
			Long key = entry.getKey();
			System.out.println(value + " " + key);
		}

		System.out.println("====================");

		Set<Long> keySet = hashMap.keySet();
		for (Long integer : keySet) {
			System.out.println(integer);
		}

		
		Collection<String> values = hashMap.values();
		for (String string : values) {
			System.out.println(string);
		}
		System.out.println("==============");
		System.out.println(hashMap.get(1567890678l));

	}
}
