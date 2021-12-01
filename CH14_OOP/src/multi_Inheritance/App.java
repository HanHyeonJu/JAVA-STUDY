package multi_Inheritance;

interface Speaker{
	void speak(); // 추상메소드
}
interface Greeter{
	void greet();
}

public class App {

	public static void main(String[] args) {
		// 인터페이스는 다중 구현이 가능
		Person p1 = new Person();
		p1.greet();
		p1.speak();
		
		Speaker p2 = new Person(); // person이 구현한 인터페이스 Speaker로 선언
		p2.speak();
	//	p2.greet(); speaker 인터페이스와 추상메소드만 가능
		
		Greeter p3 = new Person();
		p3.greet();
		//p3.speak(); 인터페이스 추상메소드만 사용가능
	}
	

}
