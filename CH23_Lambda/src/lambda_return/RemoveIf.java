package lambda_return;

import java.util.ArrayList;
import java.util.List;


public class RemoveIf {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(2);
		numbers.add(9);
		numbers.add(10);
		numbers.add(4);
		
		// 리스트 넘버즈 안에 있는 정수들 중에 6보다 작으면 다 제거
		// removeIf 메소드는 predicate로 검사(test)해서 참이면 다 제거
//		numbers.removeIf(new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer i) {
//				return i < 6; // i가 6보다 작으면 참
//			}
//		}); 
		// predicate를 람다식으로 표현한 것(?)
		numbers.removeIf( i -> i <6);// 참, 거짓을 구분할 조건을 romoveIF()안에 작성
		numbers.forEach(x -> System.out.println(x));
		
		List<String> slist = new ArrayList<>();
		slist.add("하나둘");
		slist.add("하나둘셋");
		slist.add("하나둘셋넷");
		slist.add("하나둘셋넷다섯");
		
		// 문자열 길이가 4보다 작으면 다 제거
		slist.removeIf(s -> s.length()<4);
		slist.forEach(s -> System.out.println(s)); // removeif를 사용할 때 쓴 변수s와 다른 변수 s
	}
}
