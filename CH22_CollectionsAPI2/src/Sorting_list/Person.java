package Sorting_list;

public class Person implements Comparable<Person> {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person o) {
		// 객체끼리 비교해서 누가 큰 지 코드 작성
		return name.compareTo(o.name);
		// 문자열까지 비교하는 메소드 compareTo 사용하여 이름으로 비교
	}
}
