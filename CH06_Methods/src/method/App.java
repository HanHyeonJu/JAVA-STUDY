package method;

public class App {

	public static void main(String[] args) {
		// 인스턴스 변수의 값이 없을 때 자동으로 0, null 초기화됨
		
		Person p1 = new Person();
		
		System.out.println(p1.name); // 참조자료형 String은 널 초기값
		System.out.println(p1.age); // 기본자료형 int는 0초기화
		
		p1.sayHello(); // 메소드 호출
		
		p1.name = "펭수";
		p1.age = 7;
		
//		System.out.println(p1.name);
//		System.out.println(p1.age);
		p1.sayHello(); // 메소드 호출
		
		Person p2 = new Person();
		p2.name = "라이언";
		
		p2.sayHello();
		
	}

}
