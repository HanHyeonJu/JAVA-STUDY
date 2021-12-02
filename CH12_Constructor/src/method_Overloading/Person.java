package method_Overloading;

public class Person {
	// 이름이 같은 그리트 메소드가 2개
	// 메소드의 매개변수의 개수나 타입이 다르면 다른 메소드로 인식
	public void greet() {
		System.out.println("헬로우!");
	}
	
	public void greet(String name) {
		System.out.println("헬루우! "+name);
	}
	
	public void greet(int height) {
		if(height > 185) {
			System.out.println("키가 크군요!");
		}
		System.out.println("헬로우!");
	}
	
	public void greet(String name, int height) {
		if(height > 185) {
			System.out.println("키가 크군요!");
		}
		System.out.println("헬로우!");
	}
}
