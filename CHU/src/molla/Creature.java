package molla;
// 생명체
public abstract class Creature { // 추상클래스
	private int x;
	private int y;
	private int age; // 기본적으로 생명체가 갖는 요소로 위치 x, y 그리고 age가 필요하다고 생각해 선언
	
	public Creature(int x, int y, int age) { // 생명체 클래스의 기본 생성자
		this.age = age;
		this.x= x;
		this.y =y;
	} 
	
	// 생성자가 만들어질 때 3가지 요소는 받아서 넣을 수 있도록 함
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void age() {
		age++;
	}
	
	public void move(int xDistance) {
		x += xDistance;
	}
	// 나이를 먹고 x 좌표상으로 이동할 수 있다는 생명체의 공통적 기능/ 하위클래스에 상속할 수 있도록 일반 메서드로 구현
	
	public abstract void attack();
	public abstract void printInfo();
	// 모든 생명체에게 필요한 기능이지만 생명체마다 다른 기능으로 구현하기 때문에 추상메서드로 선언
	
	
	// 출력을 간편하게 하기 위해 오버라이딩함
	@Override
	public String toString() {
		return "Creature [x=" + x + ", y=" + y + ", age=" + age + "]";
	}

	

}
