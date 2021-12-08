package timer_Example3;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task1 extends TimerTask{ // 추상클래스를 상속받음

	@Override
	public void run() {
		System.out.println("타이머1 헬루우!");
	}
	
}

class Task2 implements Runnable{ // 인터페이스를 구현(?)

	@Override
	public void run() {// Runnable의 추상메소드를 구현(완성)한다.
		// 할일의 코드를 적는다.
		System.out.println("타이머2 하이!");
	}
	
}// 반복할 실행문



public class App {

	public static void main(String[] args) {
		// 타이머1
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task1(), 0L, 1000L);
		
		// 타이머2
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		
		executor.scheduleAtFixedRate(new Task2(), 0, 1, TimeUnit.SECONDS); // 1초에 한 번씩 반복
	}

}
