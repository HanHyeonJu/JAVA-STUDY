package lambda_example;

//인터페이스 만들기
interface Runner{
	void execute(); // 추상메서드 1개 생성 => 람다식 사용가능
} 

public class App2 {

	public static void main(String[] args) {
	
		Runner run = () ->{ // () = 매개변수, {}  = 실행코드가 한 줄일 때는 코드블록 생략가능
			System.out.println("헬로우!");	
			System.out.println("람다식");	
		}; // 인터페이스의 추상매서드의 매개변수가 존재하지 않을 때는 무조건 ()의 자리를 비워놔야 함
		run.execute(); // Runner의 추상메서드 execute가 Runner의 객체 run으로 구현되면서 실행
		
		System.out.println(run instanceof Runner); // run은 Runner의 객체인가?
		System.out.println(run.getClass()); // 객체 run의 클래스는?
	}
}
