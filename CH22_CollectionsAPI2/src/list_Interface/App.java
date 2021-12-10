package list_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// 리스트 인터페이스
		List<Integer> list1 = new ArrayList<>(); // ArrayList, LinkedList가 List에게 상속받고 있기 때문에 List로 선언 가능
		List<Integer> list2 = new LinkedList<>(); // ArrayList, LinkedList가 List에게 상속받고 있기 때문에 List로 선언 가능
		// ArrayList
		list1.add(5);
		list1.add(7);
		list1.add(8);
		// LinkedList
		list2.add(1);
		list2.add(2);
		list2.add(3);

		displayList(list1); // displayList메소드 :콘솔에 입력된 리스트 타입 객체의 아이템들을 출력
		System.out.println(); // 의미없음, 한 줄 띄우기 용
		displayList(list2);
		System.out.println();

		List<Integer> list3 = new LinkedList<>();

		list3.addAll(list1);
		list3.addAll(list2);
		displayList(list3);

	}

	/**
	 * 메소드에 관한 설명문 (여러 줄 주석) 입력된 리스트 타입개체의 아이템들을 출력
	 * 
	 * @param list (매개변수)
	 */

	/*
	 * (여러 줄 주석) 위처럼 메소드에 관한 설명문을 주석으로 달아놓으면 메소드를 마우스로 커서를 가져갔을 때 메소드에 관한 정보를 볼 수 있음
	 */

	private static void displayList(List<Integer> list) { // (리스트 타입의 <정수형> 리스트 이름)

		// list.forEach(System.out::println);
		for (int i : list) {
			System.out.println(i);
		} // for each문으로도 사용 가능
	} // 리스트가 2개이더라도 똑같은 타입의 리스트이면 한 번만 작성해줘도 괜찮음

}
