package instance_of;

import java.io.Serializable;

class Creature implements Serializable {
	private static final long serialVersionUID = 1L; // Serializable 인터페이스 메서드는 시리얼 넘버 넣어주면 오류 없어짐
}

class Cat extends Creature {
	private static final long serialVersionUID = 1L;
}

public class App {

	public static void main(String[] args) {
		// instanceof 클래스 : 객체의 타입을 판별해서 클래스의 객체가 맞으면 true 아니면 false
		Creature c1 = new Creature();
		Object c2 = c1;

		Cat c3 = new Cat();
		Serializable c4 = (Serializable) c3;

		// true or false로 출력
		System.out.println(c1 instanceof Object); // Object가 모든 클래스의 부모클래스이므로 c1의 객체가 맞다
		System.out.println(c1 instanceof Serializable); // 인터페이스를 구현했으므로 c1 객체가 맞음
		System.out.println(c1 instanceof Creature); // 본인 클래스
		System.out.println(c1 instanceof Cat); // Creature의 하위 클래스이기 때문에 객체가 될 수 없음
		System.out.println();

		System.out.println(c2 instanceof Object); // Object가 모든 클래스의 부모클래스이므로 c2의 객체가 맞다
		System.out.println(c2 instanceof Serializable); // 인터페이스를 구현했으므로 c1 객체가 맞음
		System.out.println(c2 instanceof Creature); // c2의 객체는 c1 new Creature()라고 선언했기 때문에 객체가 맞음
		System.out.println(c2 instanceof Cat); // 하위클래스 = false
		System.out.println();

		System.out.println(c3 instanceof Object); // Object가 모든 클래스의 부모클래스이므로 c3의 객체가 맞다
		System.out.println(c3 instanceof Serializable); // Cat의 인터페이스를 구현했으므로 c3 객체가 맞음
		System.out.println(c3 instanceof Creature); // c3 객체의 부모 클래스
		System.out.println(c3 instanceof Cat); // 본인 클래스
		System.out.println();

		System.out.println(c4 instanceof Object); // Object가 모든 클래스의 부모클래스이므로 c4의 객체가 맞다
		System.out.println(c4 instanceof Serializable); // 본인 클래스
		System.out.println(c4 instanceof Creature); // c4가 c3의 객체로 형변환을 해주었기 때문에 상위클래스로 인식되어 c4의 객체가 된다
		System.out.println(c4 instanceof Cat); // c4의 객체를 c3의 객체로 형변환을 해주었기 때문에 c4의 객체가 된다
	}

}
