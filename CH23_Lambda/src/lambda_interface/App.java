package lambda_interface;

import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		// predicate<제네릭타입>를 사용(이미 정의가 되어 있는 것) - true, false
		Predicate<String> p1 = new Predicate<String>() { // predicate의 익명클래스가 생성됨

			@Override //predicate의 추상메소드가 구현 됨
			public boolean test(String t) {
				// 입력된 제네릭(?)타입의 객체를 검사해서 참/거짓으로 리턴
				return t.length() < 4;
			}
		};
		
		System.out.println(p1.test("abcd"));
		System.out.println(p1.test("하나둘")); // test가 boolean 타입으로 return받기 때문에 참 거짓으로 출력됨
		
		Predicate<String> p2 = t -> t.length() < 4;
		
		System.out.println(p2.test("abcd"));
		System.out.println(p2.test("하나둘"));
	}

} // alt + <- 누르면 ctrl눌러서 보던 거에서 다시 원래대로 돌아옴
