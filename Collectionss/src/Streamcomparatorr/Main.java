package Streamcomparatorr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Comparableprogram.Student;

public class Main {
public static void main(String[] args) {
	

	ArrayList<Students> arrayList = new ArrayList<>();
	arrayList.add(new Students("asdc",23));
	arrayList.add(new Students("ded",299));
	arrayList.add(new Students("scc",26));
	arrayList.add(new Students("soc",90));

	Stream<Students> sorted = arrayList.stream().sorted(Comparator.comparing(Students ::getId));
	List<Students> list = new LinkedList<>();
	boolean addAll = list.addAll(arrayList);
	System.out.println(list);
	ListIterator<Students> listIterator = list.listIterator(list.size());
	while(listIterator.hasPrevious()) {
		System.out.println(listIterator.previous());
	}
	
	
		
}}
