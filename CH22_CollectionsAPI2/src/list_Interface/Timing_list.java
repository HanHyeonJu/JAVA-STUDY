package list_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timing_list {

	public static void main(String[] args) {
		// ArrayList와 LinkedList의 실행시간
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

//				long duration = timeOperations(arrayList);
//				System.out.println("측정시간 : " + duration);

		long duration = timeOperations(linkedList);
		System.out.println("측정시간 : " + duration);
		// 일반적인 순서대로 입력은 ArrayList가 2배 더 빠름
		// 특정 인덱스 번호에 입력이나 제거는 LinkedList가 훨씬 빠름

	}

	private static long timeOperations(List<Integer> list) {
		long start = System.currentTimeMillis(); // 시간 측정
		for (int i = 0; i < 100000; i++) {
			list.add(0, i); // 0부터 10만-1까지 리스트에 하나씩 입력, (0, i) = 0번째에 i를 계속 입력한다.
		}
		return System.currentTimeMillis() - start; // 실행시간 리턴

	}

}
