package polymorphism;

public class App {

	public static void main(String[] args) {
		// 다형성 : 자식 클래스 타입을 부모 타입으로 형 변환	
//		Cat cat1 = new Cat();
//		Cat cat2 = new HouseCat(); //클래스를 부모 클래스로 바꾸어도 정상적으로 작동함을 보여줌
//		Cat cat3 = new RoadCat();
//
//		Cat[] cats = { cat1, cat2, cat3, cat4};
//		
//		for each 반복문
//		for(Cat c :cats) {// cats배열의 각각의 객체가 c에 대입하여 반복
//			c.vocal();
//			c.hunt();
//		}
		
		Cat[] cats = { new Cat(), new HouseCat(), new RoadCat(), new Tiger() };
		// cats[0] == new Cat(); 
		// cats[1] == new Cat(); 
		// cats[2] == new Cat(); 
		// cats[3] == new Cat(); 
		
		// for 반복문
		for(int i = 0; i < cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();
		}
		// for each 반복문
		for(Cat c : cats) {
			c.vocal();
			c.hunt();
		}
		
		// 캐스팅 형변환 ( 기본 데이터 타입)
//		int a = 1.2345; // 컴파일 에러
		int b = (int)1.2345; // 캐스팅, 변환은 가능하지만 데이터 잘림
		System.out.println(b);
		
		// 참조형 타입(참조형 : 클래스나 배열 같은 거) 캐스팅
		// 상속이나 구현 관계에서만 가능
		Cat cat1 = new HouseCat(); // 업캐스팅
		HouseCat cat2 = (HouseCat)cat1; //다운캐스팅
		
	}		
}
