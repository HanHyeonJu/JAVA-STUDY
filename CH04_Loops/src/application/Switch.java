package application;

public class Switch {

	public static void main(String[] args) {
		// Switch��
		int option = 0;
		
		switch(option) {
		case 0: // �ɼǺ����� ���̽� 0�� ���� ��
			System.out.println("�ɼ� 0 ����"); // sysout �� ���� �� ����
			break; // �׻� ���̽� �ϳ� ���� break �ۼ�
			
		case 1: 
			System.out.println("�ɼ� 1 ����");
			break; 
			
		case 10: 
			System.out.println("���α׷� ����...");
			break; 
			
		default: // else�� ���� ���� ���̽��� �´� ���� ���� �� ����
			System.out.println("�߸��� �ɼǹ�ȣ.");
			break;
		}
// break�� ������ ���ǿ� ���� �ʴ� �κб����� ���� ��
	}

}
