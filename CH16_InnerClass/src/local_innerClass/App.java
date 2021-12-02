//메소드 로컬 이너클래스 : 메소드 안의 클래스
package local_innerClass;

public class App {
	private String name; // 인스턴스 변수, 객체를 생성해야 실행됨
	
	public App() {
		name = "앨리자베스"; // 기본생성자에 객체 생성
	}
	
	public static void main(String[] args) {
//		System.out.println(name); // static 메소드에서는 인스턴스 사용 불가 static은 객체를 생성하지 못함
		App app = new App(); 
//		app.name = "펭수";
		app.run();
	}

	private void run() { // name을 출력하기 위한 메소드
		System.out.println(name);
		// 클래스 안의 메소드에 클래스
		class Printer{
			public void print() {
				System.out.println(name); // 내부클래스는 상위클래스의 변수를 사용가능
			}
		}
		
//		Printer p = new Printer();
//		p.print();
//		(=)
		new Printer().print(); 
	}
}
