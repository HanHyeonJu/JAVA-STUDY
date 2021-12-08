package application;

import collections.Pair;
import heirarchy.Cat;
import heirarchy.Creature;
import heirarchy.Mammal;

public class App2 {
	public static void main(String[] args) {
		
		Pair<Integer, Cat> pair = new Pair<>(1, new Cat("마틸다")); // 정수타입과 Cat 타입 객체 생성
		
		System.out.println(pair); // Pair에서 두 클래스 타입을 합쳤기 때문에 1, 마틸다가 같이 출력
		
		//각자 출력하기
		System.out.println(pair.getOne());
		System.out.println(pair.getTwo());
		
		Pair<Creature,Mammal> pair2 = new Pair<>(new Creature("생물"),new Mammal("포유류")); 
		System.out.println(pair2);
	}
	

}
