package enum_methods;

public class App {

	public static void main(String[] args) {
		// enum에서 사용하는 메소드

		// values()
		Fruit[] fruits = Fruit.values(); // enum.values() => 이넘의 모든 상수들을 배열로 리턴

		for (Fruit f : fruits) {
			System.out.println(f);
		}
		// (=)
		for (Fruit f : Fruit.values()) {
			System.out.println(f);
		}

	// ordinal() : enum의 상수의 순서(인덱스 번호), 정수로 return
		System.out.println(Fruit.BANANA.ordinal());
		System.out.println(Fruit.APPLE.ordinal());
		System.out.println(Fruit.ORANGE.ordinal());

	// valueOf("상수값") : 상수값과 같은 enum을 찾음
		Fruit f1 = Fruit.valueOf("ORANGE"); // 문자열과 같은 상수값을 찾음
		System.out.println(f1);
		System.out.println(f1 == Fruit.ORANGE);
		

	}

}
