package method_Overloading;

public class App {

	public static void main(String[] args) {
		//메소드 오버로딩 : 메소드의 이름은 같지만 매개변수가 다른 경우
		Person person = new Person();
		
		person.greet();
		person.greet("펭수");
		person.greet(190);
		person.greet("라이언", 199);
		
		//매개변수에 따라서 다른 메소드로 정의됨
		System.out.println("123"); //문자열
		System.out.println(123); // 정수형
		System.out.println(1.23); // 상수형
	}

}
