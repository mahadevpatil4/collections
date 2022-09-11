package Comparatorexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Comparableprogram.Student;
import Streamcomparatorr.Students;

public class Main {
	public static void main(String[] args) {
		LinkedList<Employee1> linkedList = new LinkedList<>();
		linkedList.add(new Employee1("hari", 19));
		linkedList.add(new Employee1("rahul", 2));
		linkedList.add(new Employee1("praveen", 21));
		linkedList.add(new Employee1("tanu", 23));
		//List<LinkedList<Student>> asList = Arrays.asList(linkedList);

//		Collections.sort(linkedList,new Id());
//		for (Student student : linkedList) {
//			System.out.println(student);
//		}
		
	//	linkedList.stream().sorted((a,b)->b.id-a.id).collect(Collectors.toList()).forEach(System.out::println);
		//linkedList.stream().sorted(Comparator.com)
//		linkedList.stream().sorted(Comparator.comparing(Employee1::getName)).forEach(System.out::println);	
		
//		linkedList.stream().sorted(Comparator.comparing(Employee1::getId)).forEach(System.out::println);
		linkedList.stream().sorted((a,b)->b.name.compareTo(a.name)).collect(Collectors.toList()).forEach(System.out::println);
		linkedList.stream().sorted((a,b)->a.id-b.id).collect(Collectors.toList()).forEach(System.out::println);
		linkedList.stream().sorted((a,b)->a.name.compareTo(a.name)).collect(Collectors.toList()).forEach(System.out::println);;
		
	}
}
