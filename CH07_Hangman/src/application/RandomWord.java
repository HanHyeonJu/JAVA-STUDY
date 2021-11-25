package application;

import java.util.Random;

public class RandomWord {
	// �����̽��ٷ� ����� �ܾ���� ���ڿ��� str�� ������
	private String str = "collection manufacturer economics painting distribution replacement percentage chocolate customer elevator cigarette foundation employment initiative operation platform leadership university strategy priority possibility election depression accident property inspector organization administration marriage teaching baseball guidance environment historian passenger philosophy engineering language relationship childhood satisfaction information permission medicine solution importance attitude politics industry complaint";
	// str�� ����� ���ڿ����� words��� �迭�� ����
	// ���ڿ��� �����̽��� �߶� �迭�� �ܾ�� �Է�
	private String[] words = str.split(" ");

	private String selectword; // �������� ���õ� �ܾ�
	private char[] characters; // ���� �迭(ö�ڸ� ������ ����)
	private Random random = new Random(); // ???????????????????????

	public RandomWord() {
		// �����ڿ� ���� �ܾ ����

//		selectword = words[0]; // �������� ���õǵ��� ���� - >
		selectword = words[random.nextInt(words.length)];
		characters = new char[selectword.length()]; // ���ôܾ��� ���̸�ŭ ���ڹ迭 ũ��� ����
	}

	public void getWords() {
		for (String word : words) {
			System.out.println(word);
		}
	}
	

	public String toString() {
		// �ܾ_�� ����Ѵ�.
//		String text = "";
		StringBuilder sb = new StringBuilder();
		//characters[3] ='X'; //�׽�Ʈ
		for (char c : characters) {
//			if (c == '\u0000'){//��������u000�� ������ �ʱⰪ(������ 0, ���ڿ��� null), ������ �ʱⰪ�̸� ���� ������ ���� ����
////				text += '-';// Ʋ������
//				sb.append('_');
//			} 
//			else{
//				sb.append(c); // ��������
//			}
			sb.append(c=='\u0000'? '_' : c); // ���׿����ڸ� �̿��� ���
			sb.append(' '); // ö�ڸ� ��ĭ�� �����̽���
			
		}
		
		//System.out.println(selectword); // ������� (�׽�Ʈ��)
		return sb.toString(); // ���õ� ���� �ܾ ������
	}
	
	public void addGuess(char c) {
		//�Ѿ�� ���ڸ� �˻��ؼ� ���� �ܾ ������ characters �迭�� ����
		for(int i = 0; i < selectword.length(); i++ ) { //�ܾ� ���̸�ŭ �ݺ�
			if(c == selectword.charAt(i)) {
				characters[i] = c; //������� �ϸ� ���� �ܾ �� ���ߴ��� ������� �ʴ´�, üũ ��� �ܾ ������ �����ϴ� �ڵ� �ʿ�
			}
		}
	}


}

