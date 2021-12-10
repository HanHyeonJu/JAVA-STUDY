package examplemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;


class Person implements Comparable<Person>{ // 키 값으로할 클래스, 이름으로 구분
	// Person의 이름으로 equals 메소드 만들어 key값의 중복을 이름으로 하도록 한다
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
		
		
	}
	// equals가 없을 때 그냥 객체에 따라서 중복이 되느냐 안 되느냐 구분해서 출력

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}

	// TreeMap을 정렬해주기 위해 Comparable 인터페이스 구현
	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name); // 이름으로 비교
	}
	
	
}

public class App {

	public static void main(String[] args) {
		// 맵을 사용한 예제
		// 1. HashMap, LinkedMap, TreeMap 만들기
		
		Map<Person, Boolean> people1 = new HashMap<>(); 
		Map<Person, Boolean> people2 = new LinkedHashMap<>();
		Map<Person, Boolean> people3 = new TreeMap<>();
		
		// 맵에서 Key값으로 중복을 결정하는데 Person클래스에서 equals 메소드를 만들어 이름이 같으면 중복이 되게 수정
		inputMap(people1);
		displayMap(people1);
		
		inputMap(people2);
		displayMap(people2);
		
		// TreeMap은 정렬하는데 이 때 키값인 Person 클래스에서 Comparable 인터페이스를 구현해야 한다.
		inputMap(people3);
		displayMap(people3);
	}

	private static void displayMap(Map<Person, Boolean> map) {
		// 맵의 Key와 Value값 출력
		map.forEach((k, v)->System.out.println(k + " : "+v));
		System.out.println(); // 한 줄 띄우기
	}

	private static void inputMap(Map<Person, Boolean> map) { //다른 맵들도 쓸 수 있도록 수정한 것
		// 맵의 person 객체와 boolean을 입력(원격여부)
		map.put(new Person("펭수"), true);
		map.put(new Person("둘리"), false);
		map.put(new Person("길동"), false);
		map.put(new Person("라이언"), false);
		map.put(new Person("라이언"), false); //똑같은 이름은 중복 안 됨
		map.put(new Person("둘리"), true); // 둘리의 값은 업데이트(false에서 true로)
	}
	


}
