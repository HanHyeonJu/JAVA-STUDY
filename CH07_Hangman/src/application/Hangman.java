package application;

import java.util.Scanner;

public class Hangman {

	private boolean running = true; // ������ ��� ����?
	private  RandomWord word =new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	private int remainTries = 7; // �õ�Ƚ��
	private char lastGuess; // �����Է¹���
	
	// ���α׷��� �����ϴ� �� �޼ҵ� 
	public void run() {
		do {
			displayWord(); // ȭ�鿡 �ܾ�ǥ��(ex)_ _ _ _ _ _ _ _)
			getUserInput(); // �Է¹���(ö�� �ϳ�)
			checkUserInput(); // �´��� üũ => ���� �� running = false => ��������
		}while(running);
	}
	
   // displayWord, getUserInput, checkUserInput�� �޼ҵ带 �������
	private void displayWord() {
//		System.out.println("ȭ�鿡 �ܾ� ǥ��");
	  // ���� ���� ��ü�� ������ �������� �� �ܾ ����Ѵ�.
		
		 System.out.println(word.toString());
	}
	
	private void getUserInput() {
		// �������� �� ���� �Է� �䱸
		// �Է¹��� ���ڿ����� �� ���ڸ� �̾Ƽ�
		// RandomWord Ŭ������ ���� 
		System.out.print("�� ���� �Է� : ");
		String guess = scanner.nextLine(); // �Է¹��� ���ڿ��� guess�� ����
		// �ܾ�� �Է¹��� ���ڰ� �ִ��� Ȯ���ؼ� ó���Ѵ�.(�ܾ�� RandomWord ��ü word�� ���)
		word.addGuess(guess.charAt(0)); //ù��° ���ڸ� �Է�
		
	}

	private void checkUserInput() {
		//System.out.println("�´��� üũ");
		// ������ �ܾ �� ������� üũ�ؼ� ������ ����
		// ���� ���� Ȯ���� �ϴ� �޼ҵ� isCompleted�� RandomWord Ŭ������ �����
		if(word.isCompleted()) {
			System.out.println("�� ������!");
			System.out.println("������ : " + word.toString());
			running = false; // �ݺ��� �������� => ����
		}
	}

	/**
	 * ��ĳ�ʸ� �ݴ� �޼ҵ�*/
	public void close() {
		scanner.close();
	}

}
