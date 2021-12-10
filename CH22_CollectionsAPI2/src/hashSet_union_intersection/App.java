package hashSet_union_intersection;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		HashSet<String> list1 = new HashSet<>();
		list1.add("사과");	
		list1.add("배");	
		list1.add("딸기");	
		list1.add("수박");	
		
		HashSet<String> list2 = new HashSet<>();
		list2.add("체리");	
		list2.add("배");	
		list2.add("사과");	
		list2.add("오렌지");
		
		// 합집합
		HashSet<String> union = new HashSet<>(list1); // 처음 생성시 리스트1을 입력해 생성
		union.addAll(list2); // list1과 list2를 둘 다 저장, 중복되는 것은 삭제
		
		union.forEach(System.out::println); 
		System.out.println();
		
		//교집합
		HashSet<String> intersection = new HashSet<>(list1);
		intersection.retainAll(list2); // retainAll을 사용하면 리스트1과 2에 중복되는 것들만 남김
		
		intersection.forEach(System.out::println); 
		System.out.println();
		
		// A - B 마이너스
		HashSet<String> minus = new HashSet<>(list1);
		minus.removeAll(list2); // removeAll을 사용하면 리스트1에 있는 데이터 중 리스트2와 같은 데이터가 있다면 삭제되고 리스트1에만 있는 데이터만 출력 
		
		minus.forEach(System.out::println); 	
	}

}
