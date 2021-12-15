package multiThread;

public class App {

	public static void main(String[] args) {
		// 멀티 쓰레드
		// 인터페이스 Runnable의 추상 메소드는 void run();
		Runnable runnable = () -> { // Runnable 인터페이스의 객체 runnable을 람다식을 생성하여 만들어 줌 
			for(int i = 0; i < 100; i++) {
				System.out.println("i : " + i);
				try { //Thread는 예외처리(try-catch) 필요 
					Thread.sleep(500); // 0.5초 대기
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
		};
		
		//runnable.run();
		//Thread : Thread를 생성하여 runnable의 for문 실행
		//run과 비슷, 뭐 동시에 여러명이 접속하거나 프로그램 두 개를 같이 실행해야 할 일이 있을 때 사용한다고 함
		Thread t1 = new Thread(runnable); // t1 쓰레드 생성
		Thread t2 = new Thread(runnable); // t2 쓰레드 생성
		
		t1.start(); // t1 실행
		t2.start(); // t2 실행
		
		System.out.println("헬로우!"); //메인쓰레드가 가장 먼저 실행된다.
	}

}
