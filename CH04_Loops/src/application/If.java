package application;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		//��ĳ��
		Scanner scanner =new Scanner(System.in); 
		
		System.out.print("����� ������?");
		int apple = scanner.nextInt();
		
		System.out.print("�ٳ����� ������?");
		int banana = scanner.nextInt();
		scanner.close(); // ��ĳ�ʸ� �� �̻� ���� ���� ���� ���� ������� ��
		
		if(apple > banana) {
			System.out.println("����� �ٳ������� ����");
		}
		if(banana > apple) {
			System.out.println("�ٳ����� ������� ����");
		}
		System.out.println("���α׷� ����.");

		// IF ���ǹ�
//		int apple = 5;
//		int banana = 10;
//		
//		// if�� ������ ���� ��쿡 {}���� ��ɹ��� �����Ѵ�		
//		if(apple > banana) {
//			System.out.println("����� �ٳ������� ����");
//		}
//		System.out.println("���α׷� ����.");
//		
//		������ �־ ���α׷� ������ ������
	}

}
