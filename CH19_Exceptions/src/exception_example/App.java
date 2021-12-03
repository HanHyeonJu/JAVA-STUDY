package exception_example;

public class App {
	public static void main(String[] args) throws InterruptedException { // InterruptedException같은 예외가 발생하면 throws 하겠다(?)
		System.out.println("하나");
		Thread.sleep(2000); // 2초 프로그램 대기 => Tread.sleep을 사용하면 예외처리를 해주어야 함
		System.out.println("둘");
	}

}
