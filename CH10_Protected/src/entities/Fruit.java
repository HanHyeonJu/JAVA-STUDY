package entities;

public class Fruit {
	protected int id; // 같은 패키지에 있는 클래스들에서만 사용가능

	@Override
	public String toString() {
		return "Fruit [id=" + id + "]";
	}	
}
