package lambda_parameter2;

interface Runner{
	void execute(String name, String text); // 리턴 값이 없는 추상 메서드
}

public class App {

	public static void main(String[] args) {
		// 매개변수가 여러 개 인터페이스의 람다식
		Runner run = (n, t) -> System.out.printf("%s님 %s \n", n, t);
		run.execute("펭수", "안녕하세요~");
		
		
	}

}
