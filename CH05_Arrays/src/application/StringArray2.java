package application;

public class StringArray2 {

	public static void main(String[] args) {
		// 문자열은 참조 자료형, 참조 변수(reference variable)는 주소값을 가진다.
		String text = null; // null값은 주소값이 없다는 것, 참고로 int x =null;같이 기본 자료형에는 널값을 입력불가
		// String text - 참조변수
//		text = new String("헬로우");
		// text는 참조 변수이기 때문에 헬로우라는 값을 가지고 있는게 아니라 값이 만들어진 새로운 배열의 주소값을 가지고 있는 것임(?)
		text = "헬로우"; // 배열은 이렇게 쓰면 안 됨
				
		System.out.println(text);
		
		String[] texts = null;
		System.out.println(texts);
		
		texts = new String[3]; // 배열 문자열 3칸을 실제 생성 texts에 주소 입력
		System.out.println(texts);
		// 값이 아닌 주소가 출력됨
		
		System.out.println(texts[0]); // 배열에 아무것도 안 넣었기 때문에 null값 출력
		
		texts[0] = new String("하이!");
		texts[1] = "안녕?";
		texts[2] = "굿 바이!";
		
		for(String w : texts) {
			System.out.println(w);
		}
	}

}
