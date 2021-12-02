package timer_Ex;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;


class Task1 extends TimerTask{
	private int i = 0;
	@Override
	public void run() {
		i++;
		System.out.println("��� ��� ��"+ i);
	}	
}

class Task2 implements Runnable{

	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, "��� ��� �Ϸ�");
	}
	
}

public class App {

	public static void main(String[] args) {
		// 1. 5�� ���� Ÿ�̸� "��� ��� ��"
		// 2. 30�� ���� Ÿ�̸� "��� ��� �Ϸ�"
		// Ÿ�̸�1
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task1(), 5000, 5000); // 5�ʿ� �� ����
		
		
		
		//Ÿ�̸�2
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task2(), 30, 30, TimeUnit.SECONDS); // 30�ʿ� �� ����
		
	}

}
