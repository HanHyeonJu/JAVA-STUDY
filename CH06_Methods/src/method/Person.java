package method;

public class Person {
//	클래스 안에 만든 변수를 인스턴스 변수라고 한다 => 객체 생성시 생성됨
	String name;
	int age;
	// 클래스 안에 만든 함수를 메소드라고 부른다 => 객체 생성시 생성됨
	// 단어마다 끊을 때는 두번째 단어의 첫글자를 대문자로 작성한다
	void sayHello() {// 리턴타입 : 메소드가 실행 후 리턴하는 값의 타입, 반환형이라고도 한다
					 // void : return되는 타입이 없음을 의미, void를 선언하엿으므로 아무것도 리턴하지 않아야 함
					 
//		System.out.println("헬로우!");
		System.out.println("헬로우!" + name);
	}
}
