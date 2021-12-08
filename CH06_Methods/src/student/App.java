package student;

public class App {

	public static void main(String[] args) {
		// 빠른 클래스 생성방법 1. 변수 2. 생성자 3. 게터세터 4. toString
		// 2~4번까지 자동완성(오른쪽 마우스 -> 소스 -> 제너레이트어쩌궁저쩌궁)
		
		Student s1 = new Student("펭수",7);
		Student s2 = new Student("길동",37);
		Student s3 = new Student("라이언",17);
		Student s4 = new Student("오리온",27);
		
		s1.setIsVisible(false); // 펭수는 원격, 온도측정 안함
		s2.setTemperature(35.5); // 길동은 집체, 온도 35.5
		s3.setTemperature(37.5); // 라이언은 집체, 온도 37.5
		s4.setIsVisible(false); // 오리온도 원격
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		
	}

}
