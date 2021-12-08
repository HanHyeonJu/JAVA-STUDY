package interfaces;

public class App {

	public static void main(String[] args) {
		// 인터페이스
//		Describable ds = new Describable(); 객체를 만들 수 없다.
		
//		Object[] objs = { new Person(), new Computer() }; // Object는 모든 클래스의 부모 클래스라 요렇게 만드는 것이 가능
		Describable[] objs = { new Person(), new Computer() };
		
		for(Describable ob : objs) {
			System.out.println(ob.getDescription());
		}

	}

}
