package interface_inheritance;

public class Machine implements DefaultRunnable {

	@Override
	public void run() { // run�� runnable �������̽��� �߻�޼ҵ�
		System.out.println("�ӽ� ����!");
	}

//	@Override
//	public void displayDetails() {
//		System.out.println("ǥ���� �����Ͼ���");
//	}
//	
}
