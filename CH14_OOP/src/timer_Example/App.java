package timer_Example;

import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask{ // 추상클래스를 상속받음

	@Override
	public void run() {
		System.out.println("헬루우!");
	}
	
}

public class App {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0, 1000);
		
		
	}

}
