package application;

import collections.Wrapper;
import heirarchy.Cat;
import heirarchy.Creature;
import heirarchy.Mammal;
//import heirarchy.Creature;
//import heirarchy.Mammal;

public class App {

	public static void main(String[] args) {
		Wrapper<Cat> wrap1 = new Wrapper<>();
		Wrapper<Creature> wrap2 = new Wrapper<>();
		Wrapper<Mammal> wrap3 = new Wrapper<>(); // wrapper로 데이터 가져오기(?)
		
		Cat cat = new Cat("마틸다");
		Creature cr  = new Creature("크리쳐");
		Mammal mam = new Mammal("포유류");
	
		//wrapper.set(cat); // object변수는 모든 클래스의 변수를 가져올 수 있음 Object가 모든 믈래스의 부모이기 때문에
						  //= Wrapper wrapper = new Cat("마틸다");(?)
//		wrapper.set(cr);
//		wrapper.set(mam);
		
	
//		Cat c1 = (Cat)wrapper.get();
		// 리턴이 Object이기 때문에 형변환(Cat), 하위로 변환해준 것
		
		wrap1.set(cat);
		wrap2.set(cr);
		wrap3.set(mam);
		
		Cat c1 = wrap1.get();
		Creature c2 = wrap2.get();
		Mammal m1 = wrap3.get();
		
		
		System.out.println(c1); // name출력, toString을 생략한 것
		System.out.println(c2);
		System.out.println(m1);
		
	}

}
