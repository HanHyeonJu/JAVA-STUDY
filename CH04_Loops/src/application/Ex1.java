package application;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// if ����

		System.out.println("�޴�");
		System.out.println("====");
		
		System.out.println("1. ����Ʈ '��ο�'");
		System.out.println("2. ����Ʈ '�ȳ� ?'");
		System.out.println("3. ���α׷� ����\n");
		
		Scanner scanner =new Scanner(System.in); 
		System.out.print("�ɼ��� ���� > ");
		int a = scanner.nextInt();
		scanner.close();
		/*
		if(a == 1) {
			System.out.println("��ο�");
		}
		else if(a == 2) {
			System.out.println("�ȳ� ?");
		}
		else if(a == 3) {
			System.out.println("�����մϴ�...");
		}
		else if(a == 10000) {
			System.out.println("�̽��Ϳ��׸� �߰��߽��ϴ�.");
		}
		else {
			System.out.println("�߸��� �ɼ��Դϴ�.");
		}*/
		
		// switch case  ����
		switch(a) {
		case 1:
			System.out.println("��ο�");
			break;
		
		case 2:
			System.out.println("�ȳ� ?");
			break;
			
		case 3:
			System.out.println("�����մϴ�...");
			break;
			
		case 10000:
			System.out.println("�̽��Ϳ��׸� �߰��߽��ϴ�.");
			break;
			
		default:
			System.out.println("�߸��� �ɼ��Դϴ�.");
			break;
		}
		
	}

}
