package appication;

import entities.*; // 다른 패키지에 있는 클래스들이기 때문에 import로 불러 와야함, * : 전체 불러옴

public class App {
	public static void main(String[] args) {
		Fruit f1 = new Apple();
//		f1.id // fruit 클래스에서 protected로 id메소드를 만들었기 때문에 다른 패키지인 app에서 사용할 수 없다.
		System.out.println(f1.toString());
		
		Fruit f2 = new Banana();
		System.out.println(f2.toString());
	}
}
