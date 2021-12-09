package equals;

import java.util.Objects;

class Person{
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	} // 객체는 다르지만 객체 안의 데이터가 똑같으므로 같다고 표현하고 싶을 때
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // this는 p1객체 obj가 다른 객체라고 생각하면 됨
			return true; // 이름 뿐만 아니라 객체가 같을 경우
		if (obj == null)
			return false; // 비교할 대상이 null값이면 비교를 할 수가 없으므로 false
		if (getClass() != obj.getClass()) // p1의 클래스와 다른 객체의 클래스가 다른 경우
			return false; // false 출력
		Person other = (Person) obj; // ???
		return Objects.equals(name, other.name); // 위의 3가지 경우가 아닐 때 p1 객체의 name과 다른 객체의 name과 비교
	}
}

public class App {

	public static void main(String[] args) {
		// 같은지 비교하는 메소드
		Person p1 = new Person("펭수");
		Person p2 = new Person("펭수"); // name은 같지만 서로 다른 객체
		
		System.out.println(p1 == p2); // p1과 p2의 객체가 다르므로 false 출력
		System.out.println(p1.equals(p2)); // Person 클래스에 hashcode -  equals를 하기 전에는 위의 sysout과 같이 false 출력
										   // Person 클래스에 hashcode -  equals를 오버라이드 해주고 값을 리턴 받으면 true 출력
	}

} 
  
