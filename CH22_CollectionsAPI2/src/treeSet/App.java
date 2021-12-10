package treeSet;

import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
	} // 이름을 문자열로 비교(이미 문자열에 비교메서드 compareTo가 구현되어 있음)
	
}

public class App {

	public static void main(String[] args) {
		// TreeSet은 정렬기능을 추가한 Set
		// 정렬기능이 있는 Set이기 때문에 객체가 비교 가능해야 함
		// 반드시 Comparable 인터페이스를 구현한 클래스 객체 입력(문자타입처럼 크고 작고가 구분이 안 되는 클래스 객체)
		TreeSet<Person> people = new TreeSet<>();

		people.add(new Person("펭수"));
		people.add(new Person("라이언"));
		people.add(new Person("가가멜"));
		people.add(new Person("스머프"));

		for (Person p : people) {
			System.out.println(p);
		}
		System.out.println();

		TreeSet<Integer> list = new TreeSet<>();
		list.add(75);
		list.add(3);
		list.add(58);
		list.add(25);

		for (int i : list) {
			System.out.println(i);
		}
	}

}
