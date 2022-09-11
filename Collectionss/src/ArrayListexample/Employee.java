package ArrayListexample;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Employee {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("hari");
		list.add("arun");
		list.add("rahul");
		list.add("zaju");

		list.stream().max(String::compareTo).ifPresent(System.out::println);

		System.out.println("================================================");

		Collections.sort(list, Collections.reverseOrder());
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("=================");

		ListIterator<String> listIterator = list.listIterator(list.size());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

		list.add(1, "hello");
		System.out.println(list);

		list.remove(1);
		System.out.println(list);

		System.out.println(list.get(3));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("============================");
		Collections.sort(list);
		System.out.println(list);
	}
}
