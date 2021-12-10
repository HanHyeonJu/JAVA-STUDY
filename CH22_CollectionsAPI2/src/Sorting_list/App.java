package Sorting_list;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		ArrayList<Double> doubles = new ArrayList<>();

		doubles.add(7.38);
		doubles.add(3.88);
		doubles.add(1.45);
		doubles.add(2.35);
		doubles.add(9.28);

		Collections.sort(doubles);

		doubles.forEach(System.out::println);

		// 커스텀 객체의 정렬
		ArrayList<Person> people = new ArrayList<>();

		people.add(new Person("펭수"));
		people.add(new Person("길동"));
		people.add(new Person("라이언"));
		people.add(new Person("둘리"));

		Collections.sort(people); // 바로 정렬은 불가능

		people.forEach(System.out::println);

	}

}
