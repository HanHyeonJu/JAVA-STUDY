package exception_example;

public class App {
	public static void main(String[] args) throws InterruptedException { // InterruptedException���� ���ܰ� �߻��ϸ� throws �ϰڴ�(?)
		System.out.println("�ϳ�");
		Thread.sleep(2000); // 2�� ���α׷� ��� => Tread.sleep�� ����ϸ� ����ó���� ���־�� ��
		System.out.println("��");
	}

}
