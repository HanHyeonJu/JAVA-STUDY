package application;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;

		while (true) { // ���ѹݺ�
			System.out.println("��ο�! " + count);

			if (count == 5) {
				break; // �ݺ��� ����
			}

			System.out.println("How are you.");

			count++;
		}
		
		
		System.out.println("���α׷� ����.");
	}

}
