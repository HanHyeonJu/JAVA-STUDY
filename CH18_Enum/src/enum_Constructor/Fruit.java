package enum_Constructor;

public enum Fruit { // 키워드에 따라 class가 되고 enum이 된다.
	APPLE("초록색"), BANANA("노란색"), ORANGE("오렌지색"); // 상수들의 집합
	
	private String color;
	
	Fruit(String color) { // enum의 생성자
		this.color = color; 
	}
	
	public String toString() {
		return super.toString().toLowerCase()+"("+color+")"; 
	}
}
