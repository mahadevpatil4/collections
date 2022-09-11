package ArrayListexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(50);
		list.add(30);
		list.add(60);
		list.add(10);
		list.add(90);
		
		
		Collections.sort(list,Collections.reverseOrder());
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		
		
		
				for(int i=0;i<list.size();i++) {
			if(list.get(i)%2==0) {
				
				System.out.println(list.get(i));
			}
			
			
		}
		
		System.out.println("-------------------------------");
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);  //descending
		Collections.sort(list);
		System.out.println(list);       //ascending
		
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("====================================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("============");

		ListIterator<Integer> listIterator2 = list.listIterator(list.size());
		while (listIterator2.hasPrevious()) {
			System.out.println(listIterator2.previous());
		}
		System.out.println("==============");

		for (Integer integer : list) {
			System.out.println(list);
		}
		int j = 0;
		while (j < list.size()) {
			System.out.println(list.get(j));
			j++;
		}
		System.out.println("------------------");
		ListIterator<Integer> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("===========================");

		list.set(2, 100);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		System.out.println(list.get(1));
		System.out.println("=======================");
		list.add(1, 67);
		list.add(2, 09);
		System.out.println(list);
		System.out.println("======================================");
		
		
		Collections.sort(list,Collections.reverseOrder());
		for (Integer integer : list) {
			System.out.println(integer);
			
		}
	}
}
