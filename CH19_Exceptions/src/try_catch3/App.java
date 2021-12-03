package try_catch3;

import java.util.Scanner;

public class App {

	private static Scanner scanner=new Scanner(System.in); // static �޼��忡�� ��� �� ���̱� ������ static �ٿ���

	public static void main(String[] args) {
		
		int number = getNumber(); // �޼��带 �̿��ؼ� �Է¹ޱ�
		System.out.println("�Է��� ���ڴ� : "+ number);
		scanner.close(); // ��ĳ�� ����
		

	}
	
	private static int getNumber() {// ���ڸ� �Է¹޾Ƽ� �������ֱ� ���� �޼���
		int number = 0;
		boolean isNumber= false;
		
		// ���ڸ� �Է��Ҷ����� �ݺ� do while�� ���
		do {
			System.out.print("���ڸ� �Է� : ");
			String line = scanner.nextLine();	
			
			// ���ܸ� ó���ϴ� try-catch��
			try {
				number = Integer.parseInt(line); 
				isNumber = true;
			} catch (NumberFormatException e) {
				System.out.println("������ ��ȯ�� �� �����ϴ�.");
			}
			
		}while(!isNumber); //inNumber�� true�� ����
		
		return number; // ���ڸ� �Է¹޾� ��������

}

}
