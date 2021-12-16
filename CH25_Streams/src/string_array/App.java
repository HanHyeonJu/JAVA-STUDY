package string_array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		
		Stream.of("Hello","bottole","Africa")
			.sorted() // 정렬 : 알파벳순
			.findFirst() // 첫번째
			.ifPresent((x) -> System.out.println(x));
		System.out.println();
		
		String[] items = {"치킨","원숭이","고릴라","치약","고라니","치과","고양이"}; // 문자배열
		Stream.of(items) // 배열을 입력해서 스트림 생성
			.filter(s -> s.startsWith("치")) // 문자열이 "치"로 시작하면 참
			.sorted()
			.forEach(x -> System.out.println(x + ","));
		System.out.println();
		System.out.println();
		
		int[] numbers = {2, 4, 6, 8, 10}; // 정수 배열을 new로 생성 동시에 초기화한 것
		Arrays.stream(numbers) // 배열을 stream을 생성할 때 Arrays.stream() 사용(?)
			.map(n -> n * n) //제곱
			.average() // 평균
			.ifPresent(n -> System.out.println(n)); 
			
		System.out.println();
			
		// 배열을 리스트로
		List<String> listItems = Arrays.asList(items);
		listItems.stream()
			.filter(x -> x.startsWith("고"))
			.sorted()
			.forEach(x -> System.out.println(x + ","));
		
		System.out.println();
		
		int[] nums = {9, 4, 6, 3, 1, 2, 7};
		Arrays.stream(nums)
			.filter(n -> n > 3) // 9,4,6,7
			.sorted() // 4,6,7,9
			.map(s -> s * 10) // 40, 60, 70, 90
			.forEach(n -> System.out.println(n));
		
	}

}
// list일 때는 리스트이름.stream()을 사용해서 Stream 생성
// 배열을 Stream을 생성할 때는 Arrays.stream(배열이름) 사용
// 파일을 읽어서 Stream을 생성할 경우 Files.line(파일주소(상대 or 절대)) 사용
// 리스트가 아닐 경우에는 1. Stream.of(1,2,3) => 정수형 스트링 2. Stream.of('하나','둘','셋') => 문자열 스트링
// 정수형 Stream을 생성할 때는 IntStream.range()도 사용 가능 Stream.of()와 비슷함