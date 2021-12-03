package enum_Constructor;

public enum Fruit { // 키워드에 따라 class가 되고 enum이 된다.
	APPLE("초록색"), BANANA("노란색"), ORANGE("오렌지색"); // 상수들의 집합
	
	private String color;
	
	Fruit(String color) { // enum의 생성자
		this.color = color; // (="@@색")
	}
	
	public String toString() {
		return super.toString().toLowerCase()+"("+color+")"; // super는 enum의 toString을 실행? super가 enum Fruit를 의미하나?, tolowerCase()는 소문자로 출력시킴
	}
}
