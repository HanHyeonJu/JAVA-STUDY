package arrayList;

import java.util.ArrayList;

public class Iterating {

	public static void main(String[] args) {
		// ArrayList 작성하기 쉬운 배열(?)
		ArrayList<Integer> list = new ArrayList<>(); // 정수 타입 리스트 생성

		// 리스트에 정수 추가
		list.add(7);
		list.add(9);
		list.add(123);

		// 반복문 사용
		for (Integer n : list) {
			System.out.println(n);
		} // for each문 : 간단하게 출력
		System.out.println(); // 한 줄 띄움

		for (int i = 0; i < list.size(); i++) {
			Integer n = list.get(i);

			System.out.println(i + ": " + n);
		}
		; // for 반복문 : index번호가 필요할 때
		System.out.println();

		// 컬렉션객체.forEach(각각반복), 람다식
		list.forEach(e -> System.out.println(e));

		// 메서드 레퍼런스
		list.forEach(System.out::println);
	}

}
