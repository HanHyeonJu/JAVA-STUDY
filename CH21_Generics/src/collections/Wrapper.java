package collections;

// 제네릭 타입 클래스 Wrappper
// 타입을 런타임에 지정 
public class Wrapper<E> {
	
	private E object;
	
	//get set 메서드 사용
	public void set(E object) {
		this.object = object;
	}
	
	public E get() {
		return object;
	}
}
