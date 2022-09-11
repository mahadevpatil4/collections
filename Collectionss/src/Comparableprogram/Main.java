package Comparableprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

import com.te.streamapi.Employee;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<>();

		arrayList.add(new Student("hello", 1));
		arrayList.add(new Student("rahul", 3));
		arrayList.add(new Student("rajesh", 7));
		arrayList.add(new Student("praveen", 9));
		arrayList.add(new Student("sidhu", 5));
//		Collections.sort(arrayList);
//		for (Student student : arrayList) {
//			System.out.println(student);
//		}
		
		Stream<Student> sorted = arrayList.stream().sorted(Comparator.comparing(Student::id));
		sorted.forEach(System.out::println);

		
	}

}
