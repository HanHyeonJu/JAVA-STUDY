package constructorParmeters;

public class Person {
	private String name;
	private double height;
	
	// 생성자 메소드 : public + 클래스명(), 리턴타입없음
	// public person(){} - 기본생성자
	public Person() {
		name = "익명";
		height = 170;
		System.out.println("한 사람을 생성!");
	}
	
	// get set 메소드
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
}
