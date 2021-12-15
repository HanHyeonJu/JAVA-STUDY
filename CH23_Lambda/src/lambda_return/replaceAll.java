package lambda_return;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class replaceAll {

	public static void main(String[] args) {
		// replaceAll 각각의 아이템의 연산 결과로 대체한다
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(7);
		numbers.add(3);
		
		// UnaryOperator 인터페이스의 람다식
		numbers.replaceAll(n -> n * n);
		
//		numbers.replaceAll(new UnaryOperator<Integer>() {
//			
//			@Override
//			public Integer apply(Integer n) {
//				return n * n;
//			}
//		});
		
		numbers.forEach(t -> System.out.println(t));
		System.out.println();
		
		List<String> friends = new ArrayList<String>();
		friends.add("펭수");
		friends.add("길동");
		friends.add("메리");
		friends.add("철수");
		
//		friends.replaceAll(new UnaryOperator<String>() {
//
//			@Override
//			public String apply(String t) {
//				
//				return "안녕~"+t;
//			}	
//		});
		
		friends.replaceAll(t -> "안녕~" + t);
		friends.forEach(p -> System.out.println(p));
	}

}
