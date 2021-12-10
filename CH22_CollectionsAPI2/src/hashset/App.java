package hashset;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		// set 타입은 중복이 불가능하고 순서가 없음
		HashSet<String> fruits = new HashSet<>(); // HashSet도 제네릭 타입
		
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("사과");
		
		System.out.println(fruits.contains("오렌지")); // contains : 데이터가 존재하는지 안 하는지 확인
		
		for(String f : fruits) {
			System.out.println(f);
		} // fruits의 데이터를 다 넣었는데도 중복이 된 것들은 몇 개를 입력해도 하나만 출력, 순서가 입력 순서대로가 아니라 무작위로 출력

	}

}
