package integervariable;

public class App {

	public static void main(String[] args) {
		// ���� ����� : 1. ��������(Ÿ��, �ڷ���) 2. ���� �ʱ�ȭ
		int x = 10;
		int y = 30;
		
		int z = x + y;
		
		int a; //���� a�� ����(Ÿ���ʿ�)
		int b = 10; // ���� b�� ����� �ʱ�ȭ ���ÿ�
		a = 7; // a�� �ʱⰪ �Է�
		
		// ������ ������� ������ Warnings ǥ�ð� ��
		
		System.out.println("����z�� ����: " +z); //���ڿ�("") + ���� = ���ڿ��� �ȴ�.
		System.out.println("����a�� ����: " +a);
		System.out.println("����b�� ����: " +b);
		
		// ���� ���� �ٽ� ���Ҵ�
		z = a + b;
		
		System.out.println("����z�� ����: " +z);
			
	}

}
