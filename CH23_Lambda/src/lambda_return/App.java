package lambda_return;

interface Joiner{
	String join(String text1, String text2); // 추상메서드에 리턴, 매개변수가 있는 경우
}

public class App {

	public static void main(String[] args) {
		// 리턴값이 있는 경우의 인터페이스의 람다식
		Joiner joiner = (t1, t2) -> {
			String text = t1 + " - " + t2;
			return text; // join메서드에 return값이 있기 때문에 return 생성
		};
		System.out.println(joiner.join("치킨", "맥주")); // joiner.join("","")해서 값을 리턴하면 리턴만 하고 출력이 안 되기 때문에 System.out.println을 같이 사용해줌
		System.out.println(joiner.join("학원", "공부"));
		
		Joiner joiner2 = (s1, s2) -> s1 +" + "+s2; // 코드가 한 줄일 때는 return, {} 생략가능, 그래도 join의 값 return됨
		System.out.println(joiner2.join("치킨", "맥주")); 
		System.out.println(joiner2.join("학원", "공부"));
	}

}
