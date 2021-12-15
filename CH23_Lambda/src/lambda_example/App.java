package lambda_example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {


	public static void main(String[] args) {
		// 문자열 ArrayList 작성
		List<String> list = new ArrayList<>();
		list.add("하나");
		list.add("둘");
		list.add("셋");
		
		list.forEach(new Consumer<String>() { 
		// Consumer 인터페이스는 객체를 못 만들지만 익명클래스에서 추상메소드를 구현하면 객체 생성 가능
		// void accept(String text); 추상메소드는 생략된 것
			public void accept(String t) { // 추상메소드가 구현이 된 것
			System.out.print(t+"\t");
			System.out.print("");
			} 
		});
		System.out.println();
		// 익명 클래스 => 람다식
		list.forEach(t->{
			System.out.print(t);
			System.out.print(" ");
		});
			
		
	}

}
