//�޼ҵ� ���� �̳�Ŭ���� : �޼ҵ� ���� Ŭ����
package local_innerClass2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;



public class App {
	private String name; // �ν��Ͻ� ����, ��ü�� �����ؾ� �����
	
	public App() {
		name = "�ٸ��ں���"; // �⺻�����ڿ� ��ü ����
	}
	
	public static void main(String[] args) {
//		System.out.println(name); // static �޼ҵ忡���� �ν��Ͻ� ��� �Ұ� static�� ��ü�� �������� ����
		App app = new App(); 
//		app.name = "���";
		app.run();
	}

	private void run() { // name�� ����ϱ� ���� �޼ҵ�
//		System.out.println(name);
		class Printer implements Runnable{
		// Ŭ���� ���� �޼ҵ忡 Ŭ����
//		class Printer{
//			public void print() {
//				System.out.println(name); // ����Ŭ������ ����Ŭ������ ������ ��밡��
//			}
			public void run() {
				System.out.println(name);
			}
		}
		
//		Printer p = new Printer();
//		p.print();
//		(=)
//	    new Printer().print(); 
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Printer(), 0, 1, TimeUnit.SECONDS);
	}
}
//....................??????????????