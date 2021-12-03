package enum_methods;

public class App {

	public static void main(String[] args) {
		// enum���� ����ϴ� �޼ҵ�

		// values()
		Fruit[] fruits = Fruit.values(); // enum.values() => �̳��� ��� ������� �迭�� ����

		for (Fruit f : fruits) {
			System.out.println(f);
		}
		// (=)
		for (Fruit f : Fruit.values()) {
			System.out.println(f);
		}

	// ordinal() : enum�� ����� ����(�ε��� ��ȣ), ������ return
		System.out.println(Fruit.BANANA.ordinal());
		System.out.println(Fruit.APPLE.ordinal());
		System.out.println(Fruit.ORANGE.ordinal());

	// valueOf("�����") : ������� ���� enum�� ã��
		Fruit f1 = Fruit.valueOf("ORANGE"); // ���ڿ��� ���� ������� ã��
		System.out.println(f1);
		System.out.println(f1 == Fruit.ORANGE);
		

	}

}
