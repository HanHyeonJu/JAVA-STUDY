package application;

public class LoopArray {

	public static void main(String[] args) {
		// ���ڿ� Ÿ������ ���� �迭
		
		String[] animals = {"������", "��", "���", "����"};
		
//		System.out.println(animals[0]);
//		System.out.println(animals[1]);
//		System.out.println(animals[2]);
//		System.out.println(animals[3]);
		
		// animals.length�� �ϸ� �迭�� �ƹ��� �ٸ� �����͸� �߰��ص� ��� ����
		for(int i=0; i < 4; i++) {
//			System.out.println(animals[i]);
			System.out.printf("�ε��� %d���� %s�̴� \n", i, animals[i]);
		}
		
		
	}

}