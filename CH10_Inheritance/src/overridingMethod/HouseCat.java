package overridingMethod;

public class HouseCat extends Cat {
	@Override // 어노테이션 - 오버라이딩 됐다고 표시해준 거
	public void vocal() { // 오버라이딩 메소드(상위클래스에 있는 메소드를 하위클래스에도 만든 것)
		System.out.println("미야우~");
	}
}
