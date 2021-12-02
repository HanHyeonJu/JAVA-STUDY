package references;

class Person{
	
}

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person(); // person 객체 생성
		System.out.println(p1); 
		
		Person p2 = p1;
		
		System.out.println(p2);

		test(p2); //static 메소드라서 객체없이 바로 메소드 실행
		
	}
	private static void test(Person p) {
		System.out.println(p); // 매개변수로 입력된 p의 주소를 출력
	}

} // ?????????
