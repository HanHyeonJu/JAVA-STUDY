package inheritance;

public class App {

	public static void main(String[] args) {
		// ���� Ŭ������ �޼ҵ� eat()
		Animal animal = new Animal();
		animal.eat();
		
		// �� Ŭ������ �޼ҵ� fly()
		Bird bird = new Bird();
		bird.eat(); // ��ӹ��� �޼ҵ�
		bird.fly();

	}

}
