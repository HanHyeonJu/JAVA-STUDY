package lambda_parameter;

interface Runner{
	void execute(String text);
}

public class App {

	public static void main(String[] args) {
		// 매개변수가 있는 인터페이스의 람다식
		Runner run1 = (t) -> System.out.println(t); //()는 매개변수를 의미하기 때문에 ()를 비워두지 말고 아무 변수나 적어줌
		run1.execute("펭수"); // 펭수가 system.out.println(t)를 이용해서 실행됨
		
		Runner run2 = s -> System.out.println(s); // 매개변수가 하나라면 ()는 생략이 가능하다
		run2.execute("길동");
		
	}

}
