package appication;

import entities.*; // �ٸ� ��Ű���� �ִ� Ŭ�������̱� ������ import�� �ҷ� �;���, * : ��ü �ҷ���

public class App {
	public static void main(String[] args) {
		Fruit f1 = new Apple();
//		f1.id // fruit Ŭ�������� protected�� id�޼ҵ带 ������� ������ �ٸ� ��Ű���� app���� ����� �� ����.
		System.out.println(f1.toString());
		
		Fruit f2 = new Banana();
		System.out.println(f2.toString());
	}
}
