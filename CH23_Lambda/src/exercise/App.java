package exercise;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// 연습문제
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(1000);
		list.add(3);
		list.add(6);
		list.add(-20);
		list.add(4);
		
		// 0~10 값이 아닌 값들은 모두 제거
//		list.removeIf(i -> i < 0);
//		list.removeIf(i -> i > 10);
		list.removeIf(i -> i < 0 || i > 10); // removeIf는 참이면 제거!
		// 각 아이템들에 +100
		list.replaceAll(a -> a + 100);
		
		// 출력
		list.forEach(p -> System.out.println(p));
	}

}
