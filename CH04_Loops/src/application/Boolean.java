package application;

public class Boolean {

	public static void main(String[] args) {
		// �� Ÿ���� ��, ����(true, false)
		boolean c1 = false;
		System.out.println("����1: "+c1);
		
		// �� ����� ��, ����
		boolean c2 = 4 < 5; // 4 < 5�� ������
		System.out.println("����2: "+c2);
		
		//	�� == ���� �� ��, �ƴϸ� ����, != ���� ���� �� ��, �ƴϸ� ����	
		boolean c3 = 4 != 5;
		System.out.println("����3: "+c3);
		System.out.printf("����3: %b", c3); //�Ҹ��� %b�� printf�� ���

	}

}
