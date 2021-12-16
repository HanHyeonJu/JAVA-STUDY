package stream_example;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(6);
		numbers.add(2);
		numbers.add(4);
		
		
		numbers.stream().forEach(System.out::println);
		System.out.println();
		numbers.stream()
			.filter(n -> n > 5) // stream().filter는 removeif와는 반대로 참일 때 출력
			.map(n -> n * n)
			.forEach(System.out::println); // 사실상 forEach는 굳이 stream안 써줘도 됨
	}

}
