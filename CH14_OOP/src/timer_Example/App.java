package timer_Example;

import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask{ // �߻�Ŭ������ ��ӹ���

	@Override
	public void run() {
		System.out.println("����!");
	}
	
}

public class App {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0, 1000);
		
		
	}

}
