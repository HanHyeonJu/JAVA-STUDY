package application;

public class MultiArray {

	public static void main(String[] args) {
		// ���� �迭
		String[][] texts = {
				{"�ϳ�", "��", "��"},
				{"��", "�ټ�", "����"},
				{"�ϰ�", "����", "��ȩ"},
		}; // �迭 3���� texts�� �� ����. ù��°[]�� �迭�� ����, �ι�°[]�� �迭�� ����ִ� ���� ����(?)
		
		for(int i = 0; i < texts.length; i++) {// ���߹迭�� length�� �迭�� ������ �ǹ���
//			System.out.printf("%d��° �迭 %s \n", i, texts[i]);
			String[] inArray = texts[i]; // �� ģ���� �ּ�ó�� �ϸ�(1)
			
			for(int j = 0; j < inArray.length; j++) {
				System.out.printf("%s \t", inArray[j]);
				// System.out.printf("%s \t", texts[i][j]); // (1)ó�� �ϸ� �䷸�� ���� ��
			}
			System.out.println();
		}

	}

}
