package default_Constructor;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		System.out.println("디폴트 생성자로 생성됨");
		name = "모름";
		age = 0;
	}
	
	public Person(String name) {
		System.out.println("person이 생성됨");
		this.name =name;
		age = 0;
	} // 생성자는 다른 메소드들과 다르게 리턴타입이 없고 변수명이 클래스 이름과 같다.
	
	public Person(String name, int age) {
		System.out.println("person이 생성됨");
		this.name =name;
		this.age = 0;
	}

	@Override
	public String toString() {//  객체에 정보를 입력
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
