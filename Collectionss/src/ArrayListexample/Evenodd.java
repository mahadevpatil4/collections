package ArrayListexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Evenodd {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(23, 45, 56, 22, 88);
		System.out.println(asList);
		asList.stream().forEach(System.out::println);
		System.out.println("===========================0");
		
		for (Integer integer : asList) {
			if (integer % 2 == 0) {
				System.out.println(integer);
			}
		}

		Stream<Integer> stream = asList.stream();

		List<Integer> collect = asList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(collect);

		List<Integer> collect2 = asList.stream().filter(p -> p > 50).collect(Collectors.toList());
		System.out.println(collect2);
		System.out.println("================");

		asList.stream().filter(o -> o > 50).collect(Collectors.toList()).forEach(System.out::println);

		List<Integer> collect3 = asList.stream().filter(u -> u > 10).collect(Collectors.toList());
		// asList.stream().min(Comparator<compa>)

	}

}
