package test; // �׽�Ʈ�� ��Ű��

import java.util.Random;

public class Test { 
	public static void main(String[] args) {
//		RandomWord r = new RandomWord();
//		r.getWords();
//		System.out.println(r.toString());
		Random random = new Random();
		
		String[] words = {"���","�����","���̾�","����","��"};
		for(int i =0; i<100; i++) {//�� for���� ���� ����?
			int randomIndex = random.nextInt(words.length); // 0~ (�迭����-1)���� �������� ���
			System.out.println(words[randomIndex]);
		}
	}
}
