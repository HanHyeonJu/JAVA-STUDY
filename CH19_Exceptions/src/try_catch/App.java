package try_catch;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// ���ܸ� ó���ϴ� try-catch��
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է� : ");
		String line = scanner.nextLine(); // ���ڸ� ���ڿ��� �Է¹���
		// int line = scanner.nextInt(); // ���ڷ� �Է��ϴ� ���� ��������� �Ǽ��� ���ڸ� �Է����� �� ������������ ���α׷��� ����� �� �ֱ� ������ ���ڿ��� �Է¹޴´�.
		scanner.close();
		
		int number = 0; // int���� ���� 0���� �ʱ�ȭ
		boolean isNumber = false;
		
		try { // ���ܰ� �߻��� �� �ִ� �ڵ带 ����
			number = Integer.parseInt(line); 
			// ���ڿ��� ������ ��ȯ, Integer �� int�� ��ü������ �� �� �ְ� ��, parseInt�� ��Ʈ�� ���������� �ٲ��ִ� ����
			// ���ڸ� ���ڿ��� �Է� �޾� ���������� ��ȯ������ ���ڸ� �Է� �ϸ� ���ܰ� ���� �� �־ try-catch���� �ۼ�����
			// Double.parseDouble(line); Float.parseFloat(line);  ��� ���� �� �� ����
			isNumber = true;
		} catch (NumberFormatException e) { // ���� �߻��� ���α׷� ���ᰡ �ƴ϶� ����� �̵� �� ���α׷� ������ ����
			System.out.println("������ ��ȯ�� �� �����ϴ�.");
		}
		
		if(isNumber) {
			System.out.println("�Է��� ���ڴ� : " + number);
		} // ���ܰ� �߻����� �� ���� 0�� ������ �ʰ� �ϱ� ���ؼ� �ۼ�
	}

}
