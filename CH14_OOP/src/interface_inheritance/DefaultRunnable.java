package interface_inheritance;

public interface DefaultRunnable extends Runnable{
	default void displayDetails() { // default�� ������ �޼ҵ� ��������
		System.out.println("ǥ���� �����Ͼ���");
	};
}
