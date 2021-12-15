package multiThread3;

public class App {
	
	private int value = 0;
	
	private synchronized void increment() { // 이 메소드는 한번에 하나의 쓰레드만 접속하게 하기 위함, 
	   value++;	                            //동시에 접속하는 경우 정확한 값이 나오지 않을 수 있기 때문
	}
	
	public void run() throws InterruptedException{
		Runnable runnable = () -> { // Runnable 인터페이스의 객체 runnable을 람다식을 생성하여 만들어 줌 
			for(int i = 0; i < 10000; i++) {
				increment();
			}
		};
		
	Thread t1 = new Thread(runnable);
	Thread t2 = new Thread(runnable);
	Thread t3 = new Thread(runnable);
		
	t1.start(); 
	t2.start();
	t3.start();
	
//	System.out.println("value : "+ value); ??
			
	t1.join(); 
	t2.join(); 
	t3.join(); 
		
	
	System.out.println("value : "+ value); // 조인을 사용하면 메인 쓰레드가 조인한 쓰레드들이 끝나야 출력이 됨
	}

	public static void main(String[] args) throws InterruptedException {
		// 멀티 쓰레드
		new App().run();
	}

}
