package application;

public class StringArray2 {

	public static void main(String[] args) {
		// ���ڿ��� ���� �ڷ���, ���� ����(reference variable)�� �ּҰ��� ������.
		String text = null; // null���� �ּҰ��� ���ٴ� ��, ����� int x =null;���� �⺻ �ڷ������� �ΰ��� �ԷºҰ�
		// String text - ��������
//		text = new String("��ο�");
		// text�� ���� �����̱� ������ ��ο��� ���� ������ �ִ°� �ƴ϶� ���� ������� ���ο� �迭�� �ּҰ��� ������ �ִ� ����(?)
		text = "��ο�"; // �迭�� �̷��� ���� �� ��
				
		System.out.println(text);
		
		String[] texts = null;
		System.out.println(texts);
		
		texts = new String[3]; // �迭 ���ڿ� 3ĭ�� ���� ���� texts�� �ּ� �Է�
		System.out.println(texts);
		// ���� �ƴ� �ּҰ� ��µ�
		
		System.out.println(texts[0]); // �迭�� �ƹ��͵� �� �־��� ������ null�� ���
		
		texts[0] = new String("����!");
		texts[1] = "�ȳ�?";
		texts[2] = "�� ����!";
		
		for(String w : texts) {
			System.out.println(w);
		}
	}

}
