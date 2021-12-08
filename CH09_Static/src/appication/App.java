package appication;

public class App {

	public static void main(String[] args) {
		// 스테틱 변수는 클래스명.변수로 객체 생성없이 사용, 스테틱이 아닌 것은 모두 객체를 생성해야함
		// 수학공식들은 주로 스테틱 변수로 되어있음
		System.out.println(Cat.FOOD);
		System.out.println(Math.PI);
		
		System.out.println(Cat.count); // 객체가 없제만 클래스명만 있으면 메모리에 저장되고 실행됨(메인도 마찬가지)
		
		Cat cat1 = new Cat("마틸다");
		System.out.println(cat1.getCount());// 스태틱 변수가 객체에 공유된다는 예시
		Cat cat2 = new Cat("라이언");
		System.out.println(cat2.getCount()); // 객체에 공유2
		
		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		
		Cat cat3 = new Cat("울버린");
		System.out.println(cat3.getCount()); // 객체에 공유3
		System.out.println(cat3.toString());
		
		System.out.println(Cat.getCount()); // getCount를 static 변수를 만들어주었을 때 객체 필요없이 클래스 Cat만으로 실행이 가능하다는 걸 보여줌
	}

}
