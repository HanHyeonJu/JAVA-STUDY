package application;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// do while�� ó�� �ѹ��� ���ǰ� ������� �����
		/*
		int count = 0;
		System.out.println("do while �ݺ���");
		
		do {
			System.out.println("Count: "+count);
		}while( count++ < 5); // ���� ������ �����ϱ� ������ 5���� ���
	    */
		
		final String USER_PASSWORD = "hello";
		
		Scanner scanner =new Scanner(System.in); 
		
		String password = ""; // ���ڿ� ����� �ʱⰪ�� �������� ��(null)
		
		do {
			
			System.out.println("����� �Է� > ");
			password = scanner.nextLine();
			
		}while(!password.equals(USER_PASSWORD)); // true �Ǵ� false�� �ݴ밪
		scanner.close();
		System.out.println("���� ����.");
	}

}
