package application;

class Person{// 하나의 파일에 여러개의 클래스를 만들수 있다.
	String name; // 인스턴스 변수 : 클래스만 가지고 사용할 수 있음 , 객체가 생성되어야 사용 가능

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	} // 요렇게 하면 주소 안의 리턴된 값이 나옴
	
}
//public String toString() {
//	String name;
//} //요렇게 하면 주소만 나옴



public class ClassObject {// public class는 한 파일에 하나만 생성가능, 파일이름과 같음
						  // 프로그램이 실행되는 main method가 있는 클래스
	
	public static void main(String[] args) { // static이 있으면 무조건 메모리에 올라감, 공용인가 아닌가?
		                                     // 객체가 여러개이다 보니 시작지점을 알 수가 없어서 메인이 되는 것을 만들어 둔다.		
		// 클래스와 객체
		// 클래스는 설계도 
		// 실제 사용가능한 객체를 생성 객체는 실제 메모리에 생성됨(=인스턴스)		// 객체는 넓은 의미 인스턴스는 뉴로 인해 메모리에 생성이 된 객체를 의미	
		
		Person p1; // 참조변수(String 변수이기 때문에) 펄슨 클래스 타입 p1 선언, 초기값 없음, 클래스는 초기값을 넣지 않아도 문자열형이면 null, 정수형이면 0 으로 초기화된다.	
		p1 = new Person(); // person의 실제 객체를 생성하여 그 주소값을 p1에 대입
		System.out.println(p1.toString());
		System.out.println(p1);
		p1.name = "펭수";
		
		Person p2 = new Person();
		p2.name = "길동";
		Person p3 = new Person();
		p3.name = "라이온";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
		// 다 같은 클래스 설계도를 통해서 만들어졌지만 p1, p2, p3 다 다른 객체들이다.
		
	}

}
