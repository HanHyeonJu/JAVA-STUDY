package remove_items;

import java.util.ArrayList;
import java.util.List;

class Cat{
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}

public class App {

	public static void main(String[] args) {
		Cat c1 = new Cat("마틸다");
		
		List<Cat> cats = new ArrayList<>();
		cats.add(c1);
		cats.add(new Cat("라이언"));
		cats.add(new Cat("마이클"));
		cats.add(new Cat("제니"));
		
//		cats.forEach(System.out::println);
		
		cats.remove(1); // index번호 이용해서 삭제
		cats.remove(c1); // 객체를 이용해서 삭제
		
		cats.forEach(System.out::println); // ArrayList는 데이터가 삭제되면 그 뒤에 있는 데이터가 삭제된 데이터의 인덱스 번호로 변경됨
	}

}
