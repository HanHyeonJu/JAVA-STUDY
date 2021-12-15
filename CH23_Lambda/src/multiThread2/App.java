package multiThread2;

public class App {
	
	private int value = 0;
	
	public void run() throws InterruptedException { 
		Runnable runnable = () -> { // Runnable 인터페이스의 객체 runnable을 람다식을 생성하여 만들어 줌 
			for(int i = 0; i < 10000; i++) {
				value++; // value를 1씩 증가
			}
		};
		
	Thread t1 = new Thread(runnable);
	Thread t2 = new Thread(runnable);
		
	t1.start(); 
	t2.start();
		
	System.out.println("value : "+ value); // 메인 쓰레드
		
	t1.join(); // 메인쓰레드가 t1을 실행할때까지 대기
	t2.join(); // 메인쓰레드가 t2를 실행할때까지 대기
		
	// t1이 100만큼 t2도 100만큼 동시에 변수를 증가시키기 때문에 200이 출력됨
	// 동시에 하다 보니 다른 숫자를 넣었을 때 정확한 값이 나오지 않을 수 있음(성능이 좋으면 잘 나옴)
	System.out.println("value : "+ value); // 조인을 사용하면 메인 쓰레드가 조인한 쓰레드들이 끝나야 출력이 됨
	}

	public static void main(String[] args) throws InterruptedException {
		// 멀티 쓰레드
		new App().run();
	}

}
