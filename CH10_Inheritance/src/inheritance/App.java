package inheritance;

public class App {

	public static void main(String[] args) {
		// 동물 클래스는 메소드 eat()
		Animal animal = new Animal();
		animal.eat();
		
		// 새 클래스는 메소드 fly()
		Bird bird = new Bird();
		bird.eat(); // 상속받은 메소드
		bird.fly();

	}

}
