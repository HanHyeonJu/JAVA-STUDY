package enum_example;

public class App {

	public static void main(String[] args) {		
		// enum을 클래스 처럼 사용
				Fruit f1 = Fruit.APPLE; // enum Fruit의 변수 f1은 enum Fruit의 APPLE
				Fruit f2 = Fruit.ORANGE; 
					
				System.out.println(f1);
				System.out.println(f2);
				System.out.println(f1 == f2);
	}

}
