package application;

public class StringEquals {

	public static void main(String[] args) {
		// �ΰ��� ���ڿ��� ������ ���Ѵ�.
		String t1 = "���";
		String t2 = "apple";
		
		System.out.printf("�ΰ��� ���ڿ� ��ġ : %b\n", t1 == t2);
		System.out.println("�ΰ��� ���ڿ� ��ġ : " + t1.equals(t2)); //���ڿ��� ������ true �ƴϸ� false
		
	}

}
